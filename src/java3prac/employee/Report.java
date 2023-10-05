package java3prac.employee;
import java.text.DecimalFormat;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках:");
        System.out.println("====================");
        System.out.printf("%-30s %-10s%n", "ФИО сотрудника", "Зарплата");

        DecimalFormat df = new DecimalFormat("#.00");

        for (Employee employee : employees) {
            System.out.printf("%-30s %10s%n", employee.getFullname(), df.format(employee.getSalary()));
        }
    }

    public static void main(String[] args) {
        // Создаем несколько объектов класса Employee
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иван Иванов", 5000.0);
        employees[1] = new Employee("Петр Петров", 6000.5);
        employees[2] = new Employee("Анна Сидорова", 4500.75);

        // Генерируем отчет о сотрудниках
        generateReport(employees);
    }
}
