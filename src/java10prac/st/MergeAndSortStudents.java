package java10prac.st;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MergeAndSortStudents {
    public static void main(String[] args) {
        // Создаем два списка данных о студентах
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        // Заполняем первый список
        list1.add(new Student("Иван", "Иванов", "Информатика", 2, "Группа A", 3.8));
        list1.add(new Student("Петр", "Петров", "Физика", 3, "Группа B", 4.0));

        // Заполняем второй список
        list2.add(new Student("Мария", "Сидорова", "Математика", 4, "Группа A", 3.5));
        list2.add(new Student("Анна", "Козлова", "Биология", 2, "Группа C", 4.2));
        list2.add(new Student("Алексей", "Смирнов", "История", 1, "Группа D", 3.9));

        // Объединяем два списка в один
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        // Сортируем объединенный список по среднему баллу (GPA) в порядке убывания
        Collections.sort(mergedList, Comparator.comparingDouble(Student::getGPA).reversed());

        // Выводим отсортированный список
        System.out.println("Отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
