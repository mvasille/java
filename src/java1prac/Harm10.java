package java1prac;

public class Harm10 {
    public static void main(String[] args) {
        int n = 10; // Количество элементов в ряде

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // Вычисление очередного члена ряда
            System.out.printf("H%d = %.6f%n", i, sum); // Форматированный вывод
        }
    }
}
