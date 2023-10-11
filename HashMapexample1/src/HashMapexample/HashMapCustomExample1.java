package HashMapexample;

import java.util.HashMap;
import java.util.Map;


public class HashMapCustomExample1 {
    public static void main(String[] args) {
        // Create a HashMap to store custom objects (Person) with IDs as keys
        Map<Integer, Person> personMap = new HashMap<>();

        personMap.put(1, new Person(1, "Alice"));
        personMap.put(2, new Person(2, "Bob"));
        personMap.put(3, new Person(3, "Carol"));

        // Retrieve and print a person by their ID
        Person person = personMap.get(2);
        System.out.println("Person with ID 2: " + person);

        // Iterate through the map entries
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            System.out.println(entry.toString());
        }
    }
}

