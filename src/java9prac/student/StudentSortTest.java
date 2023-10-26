package java9prac.student;
import java.util.Arrays;

public class StudentSortTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Alice"),
                new Student(1, "Bob"),
                new Student(4, "Charlie"),
                new Student(2, "David")
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортировка массива по полю iDNumber методом сортировки вставками
        sortStudentsByIDNumber(students);

        System.out.println("\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void sortStudentsByIDNumber(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}
