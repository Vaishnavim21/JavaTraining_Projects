package Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id && name.equals(person.name) && email.equals(person.email);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}

public class ArrayListValidate {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        try (var scanner = new Scanner(System.in)) {
			while (true) {
			    try {
			        System.out.print("Enter ID: ");
			        int id = Integer.parseInt(scanner.nextLine());

			        System.out.print("Enter Name: ");
			        String name = scanner.nextLine();

			        System.out.print("Enter Email: ");
			        String email = scanner.nextLine();

			        // Validate input
			        if (id <= 0 || name.isEmpty() || !email.matches("^[a-zA-Z0-9+_.-]+@(.+)$")) {
			            throw new IllegalArgumentException("Invalid input. Please enter valid data.");
			        }

			        // Check for duplicates
			        Person newPerson = new Person(id, name, email);
			        if (people.contains(newPerson)) {
			            throw new IllegalArgumentException("Person with the same ID, name, and email already exists.");
			        }

			        // Add to the list
			        people.add(newPerson);

			        System.out.println("Person added successfully.");
			    } catch (NumberFormatException e) {
			        System.err.println("Invalid ID format. Please enter a valid integer.");
			    } catch (IllegalArgumentException e) {
			        System.err.println(e.getMessage());
			    }

			    System.out.print("Do you want to add another person? (yes/no): ");
			    String response = scanner.nextLine().trim().toLowerCase();
			    if (!response.equals("yes")) {
			        break;
			    }
			}
		}

        // Display the list of people
        System.out.println("\nList of People:");
        for (Person person : people) {
            System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Email: " + person.getEmail());
        }
    }
}
