package ArrayListCustom1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCustomDemo {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(1, "Alice"));
		students.add(new Student(2, "Bob"));
		students.add(new Student(3, "Carol"));
		students.add(new Student(2, "Vivek"));

		Iterator itr=students.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
	}

