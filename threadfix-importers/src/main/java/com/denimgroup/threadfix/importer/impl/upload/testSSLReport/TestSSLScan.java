package com.denimgroup.threadfix.importer.impl.upload.testSSLReport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    @JsonProperty(value = "hint")
    private final String hint;

    @JsonCreator
    public TestSSLScan(@JsonProperty(value = "id") final String id, @JsonProperty(value = "ip") final String ip, @JsonProperty(value = "severity") final String severity, @JsonProperty(value = "finding") final String finding, @JsonProperty(value = "cve") final String cve, @JsonProperty(value = "cwe") final String cwe, @JsonProperty(value = "hint") final String hint) {
        this.id = id;
        this.severity = severity;
        this.finding = finding;
        this.cve = cve;
        this.cwe = cwe;
        this.hint = hint;
    }

    public String getId() {
        return this.id;
    }

    public String getSeverity() {
        return this.severity;
    }

    public String getFinding() {
        return this.finding;
    }

    public String getCve() {
        return this.cve;
    }

    public String getCwe() {
        return this.cwe;
    }

    public String getHint() {
        return this.hint;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TestSSLScan that = (TestSSLScan) o;

        if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
        if (this.severity != null ? !this.severity.equals(that.severity) : that.severity != null) return false;
        if (this.finding != null ? !this.finding.equals(that.finding) : that.finding != null) return false;
        if (this.cve != null ? !this.cve.equals(that.cve) : that.cve != null) return false;
        if (this.hint != null ? !this.hint.equals(that.hint) : that.hint != null) return false;
        return this.cwe != null ? this.cwe.equals(that.cwe) : that.cwe == null;

    }

    @Override
    public int hashCode() {
        int result = this.id != null ? this.id.hashCode() : 0;
        result = 31 * result + (this.severity != null ? this.severity.hashCode() : 0);
        result = 31 * result + (this.finding != null ? this.finding.hashCode() : 0);
        result = 31 * result + (this.cve != null ? this.cve.hashCode() : 0);
        result = 31 * result + (this.cwe != null ? this.cwe.hashCode() : 0);
        result = 31 * result + (this.hint != null ? this.hint.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestSSLScan{" +
                "id='" + this.id + '\'' +
                ", severity='" + this.severity + '\'' +
                ", finding='" + this.finding + '\'' +
                ", cve='" + this.cve + '\'' +
                ", cwe='" + this.cwe + '\'' +
                ", hint='" + this.hint + '\'' +
                '}';
    }
}
