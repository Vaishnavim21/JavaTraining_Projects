package com.example.fileHandling.examples;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the file to be read: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        try {
            FileReader fileReader = new FileReader(file);

            System.out.println("\nThe content of the file is:\n");
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }

            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
