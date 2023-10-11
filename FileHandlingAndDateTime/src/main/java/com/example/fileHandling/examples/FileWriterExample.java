package com.example.fileHandling.examples;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExample {

    public static void main(String[] args) {
    	
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the name of the file: ");
			String fileName = scanner.nextLine();

			System.out.print("Enter the content to be written to the file: ");
			String content = scanner.nextLine();

			try {
			    FileWriter fileWriter = new FileWriter(fileName);
			    fileWriter.write(content);
			    fileWriter.close();
			    System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
			    System.out.println("An error occurred while writing to the file.");
			    e.printStackTrace();
			}
		}
    }
}