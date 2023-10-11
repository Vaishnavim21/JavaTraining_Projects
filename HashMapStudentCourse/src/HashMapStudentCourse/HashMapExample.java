package HashMapStudentCourse;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
       
        Map<Student, Course> studentCourseMap = new HashMap<>();

        Student student1 = new Student(1, "Harsh");
        Student student2 = new Student(2, "Laksh");
        Course course1 = new Course("Math");
        Course course2 = new Course("History");

        studentCourseMap.put(student1, course1);
        studentCourseMap.put(student2, course2);

        System.out.println("Harsh is enrolled in: " + studentCourseMap.get(student1));
        System.out.println("Laksh is enrolled in: " + studentCourseMap.get(student2));
    }
}

