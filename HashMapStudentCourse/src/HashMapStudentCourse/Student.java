package HashMapStudentCourse;

public class Student {
 private int id;
 private String name;

 public Student(int id, String name) {
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
 public int hashCode() {
     return id; // Custom hash code based on the student ID
 }

 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     Student student = (Student) obj;
     return id == student.id;
 }

 @Override
 public String toString() {
     return "Student [id=" + id + ", name=" + name + "]";
 }
}

