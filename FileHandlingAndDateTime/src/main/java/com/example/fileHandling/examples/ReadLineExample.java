package com.example.fileHandling.examples;

import java.io.*;
import java.util.Scanner;

public class ReadLineExample {
    public static void main(String[] args) {
    	
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the file name: ");
			String fileName = scanner.nextLine();

			try {
			    FileReader fileReader = new FileReader(fileName);
			    BufferedReader bufferedReader = new BufferedReader(fileReader);

			    String line = null;

			    System.out.println("\nThe file contains:");
			    while ((line = bufferedReader.readLine()) != null) {
			        System.out.println(line);
			    }

			    bufferedReader.close();
			} catch (IOException e) {
			    e.printStackTrace();
			}
		}
    }
}