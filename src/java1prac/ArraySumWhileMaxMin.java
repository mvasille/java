package java1prac;
import java.util.Scanner;

public class ArraySumWhileMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Ввод элементов массива
        int i = 0;
        do {
            System.out.print("Введите элемент #" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        } while (i < size);

        // Вычисление суммы элементов с использованием цикла while
        int sum = 0;
        i = 0;
        while (i < size) {
            sum += arr[i];
            i++;
        }

        // Поиск максимального и минимального элементов
        int max = arr[0];
        int min = arr[0];
        for (i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
