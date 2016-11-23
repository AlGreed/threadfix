package com.denimgroup.threadfix.importer.impl.upload.testSSLReport;

/**
 * Created by olno on 16/11/16.
 */
public enum TestSSLSeverity {

    LOW,

    MEDIUM,

    HIGH,

    CRITICAL;

   public static boolean isVulnerable(final TestSSLScan testSSLScan){
       return testSSLScan.getSeverity().equals(TestSSLSeverity.LOW.name())
               || testSSLScan.getSeverity().equals(TestSSLSeverity.MEDIUM.name())
               || testSSLScan.getSeverity().equals(TestSSLSeverity.HIGH.name())
               || testSSLScan.getSeverity().equals(TestSSLSeverity.CRITICAL.name());
   }
}
