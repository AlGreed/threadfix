package com.denimgroup.threadfix.importer.impl.upload.testSSLReport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author alGreed
 */
public class TestSSLScan {

    @JsonProperty(value = "id", required = true)
    private final String id;

    @JsonProperty(value = "severity", required = true)
    private final String severity;

    @JsonProperty(value = "finding", required = true)
    private final String finding;

    @JsonProperty(value = "cve")
    private final String cve;

    @JsonProperty(value = "cwe")
    private final String cwe;

    @JsonCreator
    public TestSSLScan(@JsonProperty(value = "id") final String id, @JsonProperty(value = "ip") final String ip, @JsonProperty(value = "severity") final String severity, @JsonProperty(value = "finding") final String finding, @JsonProperty(value = "cve") final String cve, @JsonProperty(value = "cwe") final String cwe) {
        this.id = id;
        this.severity = severity;
        this.finding = finding;
        this.cve = cve;
        this.cwe = cwe;
    }

    public String getId() {
        return id;
    }

    public String getSeverity() {
        return severity;
    }

    public String getFinding() {
        return finding;
    }

    public String getCve() {
        return cve;
    }

    public String getCwe() {
        return cwe;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TestSSLScan that = (TestSSLScan) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (severity != null ? !severity.equals(that.severity) : that.severity != null) return false;
        if (finding != null ? !finding.equals(that.finding) : that.finding != null) return false;
        if (cve != null ? !cve.equals(that.cve) : that.cve != null) return false;
        return cwe != null ? cwe.equals(that.cwe) : that.cwe == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (severity != null ? severity.hashCode() : 0);
        result = 31 * result + (finding != null ? finding.hashCode() : 0);
        result = 31 * result + (cve != null ? cve.hashCode() : 0);
        result = 31 * result + (cwe != null ? cwe.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestSSLScan{" +
                "id='" + id + '\'' +
                ", severity='" + severity + '\'' +
                ", finding='" + finding + '\'' +
                ", cve='" + cve + '\'' +
                ", cwe='" + cwe + '\'' +
                '}';
    }
}
