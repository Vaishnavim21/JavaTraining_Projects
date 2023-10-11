package HashSetFilter;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class Student{
    public static void main(String[] args) {
        Set<Student1> studentSet = new HashSet<>();
        studentSet.add(new Student1(1, "Ram"));
        studentSet.add(new Student1(2, "Nishanth"));
        studentSet.add(new Student1(3, "Charlie"));
        studentSet.add(new Student1(4, "Ram")); // Another student with the same name

        String filterName = "Ram";

        Set<Student1> filteredStudents = studentSet.stream()
                .filter(student -> student.getName().equals(filterName))
                .collect(Collectors.toSet());

        for (Student1 student : filteredStudents) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
    
}


