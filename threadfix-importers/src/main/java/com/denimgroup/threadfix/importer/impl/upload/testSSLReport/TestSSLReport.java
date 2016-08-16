package com.denimgroup.threadfix.importer.impl.upload.testSSLReport;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author alGreed
 */
@JsonPropertyOrder({"host", "port", "startTime", "results"})
public class TestSSLReport {

    @JsonProperty(value = "host")
    private final String host;

    @JsonProperty(value = "port")
    private final String port;

    @JsonProperty(value = "startTime")
    private final String startTime;

    @JsonProperty(value = "results")
    private final List<TestSSLScan> results;

    @JsonCreator
    public TestSSLReport(@JsonProperty(value = "host") final String host, @JsonProperty(value = "port") final String port, @JsonProperty(value = "startTime") final String startTime, @JsonProperty(value = "results") final List<TestSSLScan> results) {
        this.host = host;
        this.port = port;
        this.startTime = startTime;
        this.results = results;
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

    public List<TestSSLScan> getResults() {
        return results;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final TestSSLReport that = (TestSSLReport) o;

        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (port != null ? !port.equals(that.port) : that.port != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        return results != null ? results.equals(that.results) : that.results == null;

    }

    @Override
    public int hashCode() {
        int result = host != null ? host.hashCode() : 0;
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (results != null ? results.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TestSSLReport{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", startTime='" + startTime + '\'' +
                ", results=" + results +
                '}';
    }
}
