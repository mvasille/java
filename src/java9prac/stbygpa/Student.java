package java9prac.stbygpa;
import java.util.Comparator;

public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Compare students by GPA in descending order
        double gpa1 = student1.getGPA();
        double gpa2 = student2.getGPA();

        if (gpa1 > gpa2) {
            return -1; // Return a negative value to sort in descending order
        } else if (gpa1 < gpa2) {
            return 1; // Return a positive value to sort in descending order
        } else {
            return 0; // GPAs are equal, order remains unchanged
        }
    }
}