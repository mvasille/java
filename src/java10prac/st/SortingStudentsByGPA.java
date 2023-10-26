package java10prac.st;
import java.util.*;

public class SortingStudentsByGPA {
    private Student[] iDNumber;

    public SortingStudentsByGPA(int size) {
        iDNumber = new Student[size];
    }

    // Метод для заполнения массива студентами
    public void setArray(Student[] students) {
        iDNumber = students;
    }

    // Метод для сортировки по среднему баллу (quickSort)
    public void quickSortByGPA() {
        quickSortByGPA(0, iDNumber.length - 1);
    }

    private void quickSortByGPA(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSortByGPA(low, pivotIndex - 1);
            quickSortByGPA(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        double pivot = iDNumber[high].getGPA();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (iDNumber[j].getGPA() >= pivot) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Student temp = iDNumber[i];
        iDNumber[i] = iDNumber[j];
        iDNumber[j] = temp;
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    // Метод для сортировки по другому полю (например, по имени)
    public void sortByName() {
        Arrays.sort(iDNumber, Comparator.comparing(Student::getFirstName));
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA(5);
        Student[] students = {
                new Student("Иван", "Иванов", "Информатика", 2, "Группа A", 3.8),
                new Student("Петр", "Петров", "Физика", 3, "Группа B", 4.0),
                new Student("Мария", "Сидорова", "Математика", 4, "Группа A", 3.5),
                new Student("Анна", "Козлова", "Биология", 2, "Группа C", 4.2),
                new Student("Алексей", "Смирнов", "История", 1, "Группа D", 3.9)
        };

        sorter.setArray(students);
        System.out.println("Сортировка по среднему баллу (убывание):");
        sorter.quickSortByGPA();
        sorter.outArray();

        System.out.println("\nСортировка по имени:");
        sorter.sortByName();
        sorter.outArray();
    }
}
