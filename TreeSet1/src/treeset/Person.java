package treeset;
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.id, otherPerson.id);
    }

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
    
    
}

