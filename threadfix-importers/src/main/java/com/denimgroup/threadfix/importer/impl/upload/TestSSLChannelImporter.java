package com.denimgroup.threadfix.importer.impl.upload;

/**
 * Created by olno on 18/07/16.
 */

import static com.denimgroup.threadfix.CollectionUtils.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.denimgroup.threadfix.importer.impl.upload.testSSLReport.TestSSLSeverity;
import org.apache.commons.io.IOUtils;

import com.denimgroup.threadfix.annotations.ScanFormat;
import com.denimgroup.threadfix.annotations.ScanImporter;
import com.denimgroup.threadfix.data.ScanCheckResultBean;
import com.denimgroup.threadfix.data.ScanImportStatus;
import com.denimgroup.threadfix.data.entities.Finding;
import com.denimgroup.threadfix.data.entities.Scan;
import com.denimgroup.threadfix.data.entities.ScannerDatabaseNames;
import com.denimgroup.threadfix.data.entities.ScannerType;
import com.denimgroup.threadfix.importer.impl.AbstractChannelImporter;
import com.denimgroup.threadfix.importer.impl.upload.testSSLReport.TestSSLReport;
import com.denimgroup.threadfix.importer.impl.upload.testSSLReport.TestSSLScan;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author alGreed
 */
@ScanImporter(scannerName = ScannerDatabaseNames.TESTSSL_DB_NAME, format = ScanFormat.JSON, jsonStructure = ScanImporter.JSONStructure.OBJECT)
public class TestSSLChannelImporter extends AbstractChannelImporter {

    public TestSSLChannelImporter() {
        super(ScannerType.TESTSSL);
    }

    @Nullable
    @Override
    public Scan parseInput() {
        log.debug("Starting JSON-Object parsing.");

        if (inputStream == null) {
            throw new IllegalStateException("InputStream was null. A JSON-Object was expected.");
        }

        StringReader sr;
        try {
            final BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            sr = new StringReader(IOUtils.toString(inputStream, "UTF-8").replaceAll("\u001B\\[[;\\d]*m", ""));
        } catch (final IOException e) {
            log.error("UnsupportedEncodingException.", e);
            return null;
        }

        final Map<FindingKey, String> findingMap = map();
        Scan scan = createScanWithFileNames();
        scan.setFindings(new ArrayList<Finding>());
        scan.setApplicationChannel(applicationChannel);

        final ObjectMapper objectMapper = new ObjectMapper();
        final TestSSLReport report;
        try {
            report = objectMapper.readValue(sr, TestSSLReport.class);
        } catch (final IOException e) {
            log.error("JSONException has raised by trying to read a JSON Object.", e);
            return null;
        }

        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(Long.valueOf(report.getStartTime())));
        scan.setImportTime(calendar);

        for (final TestSSLScan testSSLScan : report.getSections().getAllScans()) {
            if (!testSSLScan.getSeverity().equals("OK")) {
                final String type = testSSLScan.toString();
                final String path = report.getHost() + ":" + report.getPort();

                log.info("Creating a finding for " + testSSLScan);
                if (TestSSLSeverity.isVulnerable(testSSLScan)) {
                    findingMap.put(FindingKey.PATH, path);
                    findingMap.put(FindingKey.VULN_CODE, testSSLScan.getId());
                    findingMap.put(FindingKey.SEVERITY_CODE, testSSLScan.getSeverity());
                    findingMap.put(FindingKey.DETAIL, testSSLScan.getFinding());
                    findingMap.put(FindingKey.NATIVE_ID, hashFindingInfo(type, path, null));
                    findingMap.put(FindingKey.CVE, testSSLScan.getCve());
                    if (testSSLScan.getCwe().isEmpty()) {
                        findingMap.put(FindingKey.CWE, "310");  //CWE-310: Cryptographic Issues
                    } else {
                        findingMap.put(FindingKey.CWE, testSSLScan.getCwe().replaceAll("\\D+",""));
                    }
                    findingMap.put(FindingKey.RECOMMENDATION, testSSLScan.getHint());
                } else {
                    log.info("Ignoring informational finding: " + testSSLScan);
                }

                final Finding finding = constructFinding(findingMap);
                if (finding != null) {
                    finding.setIsStatic(false);
                    scan.getFindings().add(finding);
                }
            }
        }
        return scan;
    }

    @Nonnull
    @Override
    public ScanCheckResultBean checkFile() {
        return new ScanCheckResultBean(ScanImportStatus.SUCCESSFUL_SCAN, Calendar.getInstance());
    }
}
