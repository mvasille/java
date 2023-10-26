package java9prac.merge;
import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 3.8));
        list1.add(new Student("Bob", 3.5));
        list1.add(new Student("Charlie", 3.9));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("David", 3.7));
        list2.add(new Student("Eve", 4.0));
        list2.add(new Student("Frank", 3.6));

        List<Student> mergedList = mergeSort(list1, list2);

        System.out.println("Merged and sorted list:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getGPA() > student2.getGPA()) {
                result.add(student1);
                i++;
            } else {
                result.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }
}