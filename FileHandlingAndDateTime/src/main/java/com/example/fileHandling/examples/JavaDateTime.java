package com.example.fileHandling.examples;

import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

public class JavaDateTime {
    public static void main(String[] args) {
        // java.util.Date
        Date utilDate = new Date();
        System.out.println("java.util.Date: " + utilDate);

        // Create a java.util.Date for a specific date and time
        long specificTimeMillis = System.currentTimeMillis() - 24 * 60 * 60 * 1000; // One day ago
        Date specificUtilDate = new Date(specificTimeMillis);
        System.out.println("Specific java.util.Date: " + specificUtilDate);

        // java.sql.Date (date without time)
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println("java.sql.Date: " + sqlDate);

        // java.sql.Timestamp (date and time with milliseconds)
        Timestamp sqlTimestamp = new Timestamp(utilDate.getTime());
        System.out.println("java.sql.Timestamp: " + sqlTimestamp);

        // java.time.LocalDate (date without time or timezone)
        LocalDate localDate = LocalDate.now();
        System.out.println("java.time.LocalDate: " + localDate);

        // Convert java.util.Date to java.time.LocalDate
        LocalDate fromUtilDate = utilDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        System.out.println("Converted from java.util.Date to java.time.LocalDate: " + fromUtilDate);

        // Convert java.sql.Date to java.time.LocalDate
        LocalDate fromSqlDate = sqlDate.toLocalDate();
        System.out.println("Converted from java.sql.Date to java.time.LocalDate: " + fromSqlDate);
    }
}
