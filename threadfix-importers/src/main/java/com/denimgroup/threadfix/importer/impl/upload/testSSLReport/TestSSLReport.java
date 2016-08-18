package com.denimgroup.threadfix.importer.impl.upload.testSSLReport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author alGreed
 */
public class TestSSLReport {

    @JsonProperty(value = "host", required = true)
    private final String host;

    @JsonProperty(value = "port", required = true)
    private final String port;

    @JsonProperty(value = "ip", required = true)
    private final String ip;

    @JsonProperty(value = "version", required = true)
    private final String version;

    @JsonProperty(value = "startTime", required = true)
    private final String startTime;

    @JsonProperty(value = "scanTime", required = true)
    private final String scanTime;

    @JsonProperty(value = "scanResult", required = true)
    private final TestSSLSections sections;

    @JsonCreator
    public TestSSLReport(@JsonProperty(value = "host") final String host, @JsonProperty(value = "port") final String port, @JsonProperty(value = "ip") final String ip, @JsonProperty(value = "version") final String version, @JsonProperty(value = "startTime") final String startTime, @JsonProperty(value = "scanTime") final String scanTime, @JsonProperty(value = "scanResult") final TestSSLSections sections) {
        this.host = host;
        this.port = port;
        this.ip = ip;
        this.version = version;
        this.startTime = startTime;
        this.scanTime = scanTime;
        this.sections = sections;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getIp() {
        return ip;
    }

    public String getVersion() {
        return version;
    }

    public String getScanTime() {
        return scanTime;
    }

    public TestSSLSections getSections() {
        return sections;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TestSSLReport that = (TestSSLReport) o;

        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (port != null ? !port.equals(that.port) : that.port != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (scanTime != null ? !scanTime.equals(that.scanTime) : that.scanTime != null) return false;
        return sections != null ? sections.equals(that.sections) : that.sections == null;

    }

    @Override
    public int hashCode() {
        int result = host != null ? host.hashCode() : 0;
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (scanTime != null ? scanTime.hashCode() : 0);
        result = 31 * result + (sections != null ? sections.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestSSLReport{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", ip='" + ip + '\'' +
                ", version='" + version + '\'' +
                ", startTime='" + startTime + '\'' +
                ", scanTime='" + scanTime + '\'' +
                ", sections=" + sections +
                '}';
    }
}
