package com.example.fileHandling.examples;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaTimeClass {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Add two days to the current date
        LocalDateTime futureDateTime = currentDateTime.plusDays(2);
        System.out.println("Date in 2 days: " + futureDateTime);

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
