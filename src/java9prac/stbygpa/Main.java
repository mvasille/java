package java9prac.stbygpa;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.8),
                new Student("Bob", 3.5),
                new Student("Charlie", 3.9),
                new Student("David", 3.7)
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort students by GPA in descending order using the comparator
        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nAfter sorting by GPA in descending order:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}