package com.example.fileHandling.examples;

import java.io.*;

public class BufferedReaderExample {
	
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("fileExample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int ch;

            while ((ch = bufferedReader.read()) != -1) {
                System.out.print((char)ch);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}