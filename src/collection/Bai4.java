package collection;

import java.util.HashSet;
import java.util.Set;

public class Bai4 {
    public static void main(String[] args) {
        Student s1= new Student(1, "A", "1A");
        Student s2= new Student(2, "B", "2B");
        Student s3= new Student(3, "C", "3C");
        Student s4= new Student(1, "A", "1A");

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);
    }
}
