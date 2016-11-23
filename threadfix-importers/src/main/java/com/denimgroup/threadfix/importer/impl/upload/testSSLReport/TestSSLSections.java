package com.denimgroup.threadfix.importer.impl.upload.testSSLReport;

import com.fasterxml.jackson.annotation.JsonCreator;
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

    @JsonCreator
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
        return this.service;
    }

    public LinkedList<TestSSLScan> getProtocols() {
        return this.protocols;
    }

    public LinkedList<TestSSLScan> getCiphers() {
        return this.ciphers;
    }

    public LinkedList<TestSSLScan> getPfs() {
        return this.pfs;
    }

    public LinkedList<TestSSLScan> getServerPreferences() {
        return this.serverPreferences;
    }

    public LinkedList<TestSSLScan> getServerDefaults() {
        return this.serverDefaults;
    }

    public LinkedList<TestSSLScan> getHeaderResponse() {
        return this.headerResponse;
    }

    public LinkedList<TestSSLScan> getVulnerabilities() {
        return this.vulnerabilities;
    }

    public LinkedList<TestSSLScan> getCipherTests() {
        return this.cipherTests;
    }

    public LinkedList<TestSSLScan> getBrowserSimulations() {
        return this.browserSimulations;
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

        if (this.service != null ? !this.service.equals(that.service) : that.service != null) return false;
        if (this.protocols != null ? !this.protocols.equals(that.protocols) : that.protocols != null) return false;
        if (this.ciphers != null ? !this.ciphers.equals(that.ciphers) : that.ciphers != null) return false;
        if (this.pfs != null ? !this.pfs.equals(that.pfs) : that.pfs != null) return false;
        if (this.serverPreferences != null ? !this.serverPreferences.equals(that.serverPreferences) : that.serverPreferences != null)
            return false;
        if (this.serverDefaults != null ? !this.serverDefaults.equals(that.serverDefaults) : that.serverDefaults != null)
            return false;
        if (this.headerResponse != null ? !this.headerResponse.equals(that.headerResponse) : that.headerResponse != null)
            return false;
        if (this.vulnerabilities != null ? !this.vulnerabilities.equals(that.vulnerabilities) : that.vulnerabilities != null)
            return false;
        if (this.cipherTests != null ? !this.cipherTests.equals(that.cipherTests) : that.cipherTests != null) return false;
        return this.browserSimulations != null ? this.browserSimulations.equals(that.browserSimulations) : that.browserSimulations == null;

    }

    @Override
    public int hashCode() {
        int result = this.service != null ? this.service.hashCode() : 0;
        result = 31 * result + (this.protocols != null ? this.protocols.hashCode() : 0);
        result = 31 * result + (this.ciphers != null ? this.ciphers.hashCode() : 0);
        result = 31 * result + (this.pfs != null ? this.pfs.hashCode() : 0);
        result = 31 * result + (this.serverPreferences != null ? this.serverPreferences.hashCode() : 0);
        result = 31 * result + (this.serverDefaults != null ? this.serverDefaults.hashCode() : 0);
        result = 31 * result + (this.headerResponse != null ? this.headerResponse.hashCode() : 0);
        result = 31 * result + (this.vulnerabilities != null ? this.vulnerabilities.hashCode() : 0);
        result = 31 * result + (this.cipherTests != null ? this.cipherTests.hashCode() : 0);
        result = 31 * result + (this.browserSimulations != null ? this.browserSimulations.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestSSLSections{" +
                "service=" + this.service +
                ", protocols=" + this.protocols +
                ", ciphers=" + this.ciphers +
                ", pfs=" + this.pfs +
                ", serverPreferences=" + this.serverPreferences +
                ", serverDefaults=" + this.serverDefaults +
                ", headerResponse=" + this.headerResponse +
                ", vulnerabilities=" + this.vulnerabilities +
                ", cipherTests=" + this.cipherTests +
                ", browserSimulations=" + this.browserSimulations +
                '}';
    }
}
