package com.denimgroup.threadfix.importer.impl.upload.testSSLReport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author alGreed
 */
@JsonPropertyOrder({"id", "ip", "severity", "finding"})
public class TestSSLScan {

    @JsonProperty(value = "id")
    private final String id;

    @JsonProperty(value = "ip")
    private final String ip;

    @JsonProperty(value = "severity")
    private final String severity;

    @JsonProperty(value = "finding")
    private final String finding;

    @JsonCreator
    public TestSSLScan(@JsonProperty(value = "id") final String id, @JsonProperty(value = "ip") final String ip, @JsonProperty(value = "severity") final String severity, @JsonProperty(value = "finding") final String finding) {
        this.id = id;
        this.ip = ip;
        this.severity = severity;
        this.finding = finding;
    }

    public String getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public String getSeverity() {
        return severity;
    }

    public String getFinding() {
        return finding;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TestSSLScan that = (TestSSLScan) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (severity != null ? !severity.equals(that.severity) : that.severity != null) return false;
        return finding != null ? finding.equals(that.finding) : that.finding == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (severity != null ? severity.hashCode() : 0);
        result = 31 * result + (finding != null ? finding.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestSSLScan{" +
                "id='" + id + '\'' +
                ", ip='" + ip + '\'' +
                ", severity='" + severity + '\'' +
                ", finding='" + finding + '\'' +
                '}';
    }
}
