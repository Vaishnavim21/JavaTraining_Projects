package HashSetYearFilter;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class Members{
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student(1, "Vivek", 2005));
        students.add(new Student(2, "Harshitha", 2000));
        students.add(new Student(3, "Sunidhi R Yadav", 2001));
        students.add(new Student(4, "Lakshmi", 1998));
        students.add(new Student(5, "Vijay", 2000));

        int targetYear = 2000;
        
        Set<Student> filteredStudents = students.stream()
                .filter(student -> student.getYear() == targetYear)
                .collect(Collectors.toSet());

        System.out.println("Students from year " + targetYear + ":");
        for (Student student : filteredStudents) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}



