package HashSet;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<student> studentSet = new HashSet<>();
		studentSet.add(new student(1, "Ram"));

		student student2 = new student(2, "Harsh");
		student student3 = new student(1, "Vijay"); // Same ID as student1

		studentSet.add(student2);
		studentSet.add(student3);

		System.out.println("Number of students in the set: " + studentSet.size());

		for (student Student : studentSet) {
			System.out.println(Student.toString());
			
		}
	}
}
