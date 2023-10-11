package Address;

import java.util.ArrayList;
import java.util.List;

class Address1 {
    private String permanentAddress;
    private String temporaryAddress;

    public Address1(String permanentAddress, String temporaryAddress) {
        this.permanentAddress = permanentAddress;
        this.temporaryAddress = temporaryAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    @Override
    public String toString() {
        return "Permanent Address: " + permanentAddress + ", Temporary Address: " + temporaryAddress;
    }
}


public class AddressList {
    public static void main(String[] args) {
        List<Personlist> people = new ArrayList<>();

        // Adding persons to the list
        people.add(new Personlist(1, "Alice", new Addressclass("123 Main St", "456 Temp St")));
        people.add(new Personlist(2, "Bob", new Addressclass("789 Elm St", "101 Temp St")));

        // Displaying the list of people
        for (Personlist person : people) {
            System.out.println(person);
            System.out.println(); // Empty line for separation
        }
    }
}
