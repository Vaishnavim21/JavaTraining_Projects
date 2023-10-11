package AddressList;

import java.util.ArrayList;
import java.util.List;

class Address {
    private String permanentAddress;
    private String temporaryAddress;

    public Address(String permanentAddress, String temporaryAddress) {
        this.permanentAddress = permanentAddress;
        this.temporaryAddress = temporaryAddress;
    }

   
	public String getPermanentAddress() {
		return permanentAddress;
	}

	public String getTemporaryAddress() {
		return temporaryAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public void setTemporaryAddress(String temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}

	@Override
    public String toString() {
        return "Permanent Address: " + permanentAddress + "\nTemporary Address: " + temporaryAddress;
    }
}

class Person {
    private int id;
    private String name;
    private Address address;

    public Person(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\n" + address.toString();
    }
}

public class AddressMain {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // Adding persons with custom objects
        Address address1 = new Address("123 Main St", "456 Temp St");
        Person person1 = new Person(1, "Alice", address1);
        people.add(person1);

        Address address2 = new Address("789 Elm St", "101 Temp St");
        Person person2 = new Person(2, "Bob", address2);
        people.add(person2);

        // Displaying the list of persons
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
