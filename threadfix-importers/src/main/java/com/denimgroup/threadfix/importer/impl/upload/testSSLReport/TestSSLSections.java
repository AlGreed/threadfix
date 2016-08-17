package com.denimgroup.threadfix.importer.impl.upload.testSSLReport;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedList;

/**
 * Created by olno on 16/08/16.
 */
public class TestSSLSections {

    @JsonProperty(value = "service")
    private final LinkedList<TestSSLScan> service;

    @JsonProperty(value = "protocols")
    private final LinkedList<TestSSLScan> protocols;

    @JsonProperty(value = "ciphers")
    private final LinkedList<TestSSLScan> ciphers;

    @JsonProperty(value = "pfs")
    private final LinkedList<TestSSLScan> pfs;

    @JsonProperty(value = "serverPreferences")
    private final LinkedList<TestSSLScan> serverPreferences;

    @JsonProperty(value = "serverDefaults")
    private final LinkedList<TestSSLScan> serverDefaults;

    @JsonProperty(value = "headerResponse")
    private final LinkedList<TestSSLScan> headerResponse;

    @JsonProperty(value = "vulnerabilities")
    private final LinkedList<TestSSLScan> vulnerabilities;

    @JsonProperty(value = "cipherTests")
    private final LinkedList<TestSSLScan> cipherTests;

    @JsonProperty(value = "browserSimulations")
    private final LinkedList<TestSSLScan> browserSimulations;

    private final LinkedList<LinkedList<TestSSLScan>> allSections = new LinkedList<LinkedList<TestSSLScan>>();

    public TestSSLSections(@JsonProperty(value = "service") final LinkedList<TestSSLScan> service,
                           @JsonProperty(value = "protocols") final LinkedList<TestSSLScan> protocols,
                           @JsonProperty(value = "ciphers") final LinkedList<TestSSLScan> ciphers,
                           @JsonProperty(value = "pfs") final LinkedList<TestSSLScan> pfs,
                           @JsonProperty(value = "serverPreferences") final LinkedList<TestSSLScan> serverPreferences,
                           @JsonProperty(value = "serverDefaults") final LinkedList<TestSSLScan> serverDefaults,
                           @JsonProperty(value = "headerResponse") final LinkedList<TestSSLScan> headerResponse,
                           @JsonProperty(value = "vulnerabilities") final LinkedList<TestSSLScan> vulnerabilities,
                           @JsonProperty(value = "cipherTests")final LinkedList<TestSSLScan> cipherTests,
                           @JsonProperty(value = "browserSimulations") final LinkedList<TestSSLScan> browserSimulations) {
        this.service = service;
        this.protocols = protocols;
        this.ciphers = ciphers;
        this.pfs = pfs;
        this.serverPreferences = serverPreferences;
        this.serverDefaults = serverDefaults;
        this.headerResponse = headerResponse;
        this.vulnerabilities = vulnerabilities;
        this.cipherTests = cipherTests;
        this.browserSimulations = browserSimulations;

        this.allSections.add(this.service);
        this.allSections.add(this.protocols);
        this.allSections.add(this.ciphers);
        this.allSections.add(this.pfs);
        this.allSections.add(this.serverPreferences);
        this.allSections.add(this.serverDefaults);
        this.allSections.add(this.headerResponse);
        this.allSections.add(this.vulnerabilities);
        this.allSections.add(this.cipherTests);
        this.allSections.add(this.browserSimulations);
    }

    public LinkedList<TestSSLScan> getService() {
        return service;
    }

    public LinkedList<TestSSLScan> getProtocols() {
        return protocols;
    }

    public LinkedList<TestSSLScan> getCiphers() {
        return ciphers;
    }

    public LinkedList<TestSSLScan> getPfs() {
        return pfs;
    }

    public LinkedList<TestSSLScan> getServerPreferences() {
        return serverPreferences;
    }

    public LinkedList<TestSSLScan> getServerDefaults() {
        return serverDefaults;
    }

    public LinkedList<TestSSLScan> getHeaderResponse() {
        return headerResponse;
    }

    public LinkedList<TestSSLScan> getVulnerabilities() {
        return vulnerabilities;
    }

    public LinkedList<TestSSLScan> getCipherTests() {
        return cipherTests;
    }

    public LinkedList<TestSSLScan> getBrowserSimulations() {
        return browserSimulations;
    }

    public LinkedList<TestSSLScan> getAllScans(){
        final LinkedList<TestSSLScan> list = new LinkedList<TestSSLScan>();
        for (final LinkedList<TestSSLScan> scans : this.allSections){
            for (final TestSSLScan testSSLScan : scans){
                list.add(testSSLScan);
            }
        }
        return list;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TestSSLSections that = (TestSSLSections) o;

        if (service != null ? !service.equals(that.service) : that.service != null) return false;
        if (protocols != null ? !protocols.equals(that.protocols) : that.protocols != null) return false;
        if (ciphers != null ? !ciphers.equals(that.ciphers) : that.ciphers != null) return false;
        if (pfs != null ? !pfs.equals(that.pfs) : that.pfs != null) return false;
        if (serverPreferences != null ? !serverPreferences.equals(that.serverPreferences) : that.serverPreferences != null)
            return false;
        if (serverDefaults != null ? !serverDefaults.equals(that.serverDefaults) : that.serverDefaults != null)
            return false;
        if (headerResponse != null ? !headerResponse.equals(that.headerResponse) : that.headerResponse != null)
            return false;
        if (vulnerabilities != null ? !vulnerabilities.equals(that.vulnerabilities) : that.vulnerabilities != null)
            return false;
        if (cipherTests != null ? !cipherTests.equals(that.cipherTests) : that.cipherTests != null) return false;
        return browserSimulations != null ? browserSimulations.equals(that.browserSimulations) : that.browserSimulations == null;

    }

    @Override
    public int hashCode() {
        int result = service != null ? service.hashCode() : 0;
        result = 31 * result + (protocols != null ? protocols.hashCode() : 0);
        result = 31 * result + (ciphers != null ? ciphers.hashCode() : 0);
        result = 31 * result + (pfs != null ? pfs.hashCode() : 0);
        result = 31 * result + (serverPreferences != null ? serverPreferences.hashCode() : 0);
        result = 31 * result + (serverDefaults != null ? serverDefaults.hashCode() : 0);
        result = 31 * result + (headerResponse != null ? headerResponse.hashCode() : 0);
        result = 31 * result + (vulnerabilities != null ? vulnerabilities.hashCode() : 0);
        result = 31 * result + (cipherTests != null ? cipherTests.hashCode() : 0);
        result = 31 * result + (browserSimulations != null ? browserSimulations.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestSSLSections{" +
                "service=" + service +
                ", protocols=" + protocols +
                ", ciphers=" + ciphers +
                ", pfs=" + pfs +
                ", serverPreferences=" + serverPreferences +
                ", serverDefaults=" + serverDefaults +
                ", headerResponse=" + headerResponse +
                ", vulnerabilities=" + vulnerabilities +
                ", cipherTests=" + cipherTests +
                ", browserSimulations=" + browserSimulations +
                '}';
    }
}
