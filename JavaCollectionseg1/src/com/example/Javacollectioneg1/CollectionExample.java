package com.example.Javacollectioneg1;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        // Create a new ArrayList to store strings
        List<String> stringList = new ArrayList<>();

        // Add elements to the list
        stringList.add("Hello");
        stringList.add("World");

        // Print the elements in the list
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}

