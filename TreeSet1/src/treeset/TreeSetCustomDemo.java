package treeset;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetCustomDemo {
    public static void main(String[] args) {
        // Create a TreeSet to store custom objects (Person)
        Set<Person> people = new TreeSet<>();
        
        // Add custom objects to the set
        people.add(new Person(2, "Ram"));
        people.add(new Person(1, "Harsh"));
        people.add(new Person(3, "Charan"));
        
        
        // Print the custom objects in the set (automatically sorted)
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
