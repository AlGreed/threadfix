package com.denimgroup.threadfix.importer.impl.upload.testSSLReport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author alGreed
 */
public class TestSSLReport {

    @JsonProperty(value = "Invocation")
    private final String invocation;

    @JsonProperty(value = "at")
    private final String system;

    @JsonProperty(value = "target host", required = true)
    private final String host;

    @JsonProperty(value = "port", required = true)
    private final String port;

    @JsonProperty(value = "ip", required = true)
    private final String ip;

    @JsonProperty(value = "openssl")
    private final String openssl;

    @JsonProperty(value = "version")
    private final String version;

    @JsonProperty(value = "startTime", required = true)
    private final String startTime;

    @JsonProperty(value = "scanTime", required = true)
    private final String scanTime;

    @JsonProperty(value = "scanResult", required = true)
    private final TestSSLSections sections;

    @JsonCreator
    public TestSSLReport(@JsonProperty(value = "Invocation") final String invocation, @JsonProperty(value = "at") final String system, @JsonProperty(value = "target host") final String host, @JsonProperty(value = "port") final String port, @JsonProperty(value = "ip") final String ip, @JsonProperty(value = "openssl") final String openssl, @JsonProperty(value = "version") final String version, @JsonProperty(value = "startTime") final String startTime, @JsonProperty(value = "scanTime") final String scanTime, @JsonProperty(value = "scanResult") final TestSSLSections sections) {
        this.invocation = invocation;
        this.system = system;
        this.host = host;
        this.port = port;
        this.ip = ip;
        this.openssl = openssl;
        this.version = version;
        this.startTime = startTime;
        this.scanTime = scanTime;
        this.sections = sections;
    }

    public String getHost() {
        return this.host;
    }

    public String getPort() {
        return this.port;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getIp() {
        return this.ip;
    }

    public String getVersion() {
        return this.version;
    }

    public String getScanTime() {
        return this.scanTime;
    }

    public TestSSLSections getSections() {
        return this.sections;
    }

    public String getOpenssl() {
        return this.openssl;
    }

    public String getInvocation() {
        return this.invocation;
    }

    public String getSystem() {
        return this.system;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TestSSLReport that = (TestSSLReport) o;

        if (this.host != null ? !this.host.equals(that.host) : that.host != null) return false;
        if (this.port != null ? !this.port.equals(that.port) : that.port != null) return false;
        if (this.ip != null ? !this.ip.equals(that.ip) : that.ip != null) return false;
        if (this.openssl != null ? !this.openssl.equals(that.openssl) : that.openssl != null) return false;
        if (this.version != null ? !this.version.equals(that.version) : that.version != null) return false;
        if (this.startTime != null ? !this.startTime.equals(that.startTime) : that.startTime != null) return false;
        if (this.scanTime != null ? !this.scanTime.equals(that.scanTime) : that.scanTime != null) return false;
        if (this.invocation != null ? !this.invocation.equals(that.invocation) : that.invocation != null) return false;
        if (this.system != null ? !this.system.equals(that.system) : that.system != null) return false;
        return this.sections != null ? this.sections.equals(that.sections) : that.sections == null;

    }

    @Override
    public int hashCode() {
        int result = this.host != null ? this.host.hashCode() : 0;
        result = 31 * result + (this.port != null ? this.port.hashCode() : 0);
        result = 31 * result + (this.ip != null ? this.ip.hashCode() : 0);
        result = 31 * result + (this.openssl != null ? this.openssl.hashCode() : 0);
        result = 31 * result + (this.version != null ? this.version.hashCode() : 0);
        result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
        result = 31 * result + (this.scanTime != null ? this.scanTime.hashCode() : 0);
        result = 31 * result + (this.sections != null ? this.sections.hashCode() : 0);
        result = 31 * result + (this.invocation != null ? this.invocation.hashCode() : 0);
        result = 31 * result + (this.system != null ? this.system.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestSSLReport{" +
                "host='" + this.host + '\'' +
                ", port='" + this.port + '\'' +
                ", ip='" + this.ip + '\'' +
                ", openssl='" + this.openssl + '\'' +
                ", version='" + this.version + '\'' +
                ", startTime='" + this.startTime + '\'' +
                ", scanTime='" + this.scanTime + '\'' +
                ", invocation='" + this.invocation + '\'' +
                ", system='" + this.system + '\'' +
                ", sections=" + this.sections +
                '}';
    }
}
