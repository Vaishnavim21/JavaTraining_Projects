package com.example.fileHandling.examples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the file to be created: ");
        String fileName = scanner.nextLine();

        // Create a new file object
        File file = new File(fileName);

        try {
            // Try to create the file
            boolean success = file.createNewFile();
            if (success) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}