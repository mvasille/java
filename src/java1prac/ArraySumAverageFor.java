package java1prac;
import java.util.Scanner;

public class ArraySumAverageFor {
    public static void main(String[] args) {
        int[] arr = {1, 14, 86, 4, 53};
        int size = arr.length;

        // Вычисление суммы элементов
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // Вычисление среднего арифметического
        double average = (double) sum / size;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}
