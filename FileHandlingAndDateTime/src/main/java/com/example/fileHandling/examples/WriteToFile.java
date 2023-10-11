package com.example.fileHandling.examples;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the file name: ");
        String fileName = null;
        try {
            fileName = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error reading file name");
            return;
        }

        System.out.print("Enter the content to write: ");
        String content = null;
        try {
            content = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error reading content");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
    }
}