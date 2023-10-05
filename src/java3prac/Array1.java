package java3prac;

import java.util.Random;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Запрашиваем у пользователя размер массива
        do {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите натуральное число больше 0.");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        // Создаем массив из n случайных целых чисел
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
        }

        // Выводим первый массив на экран
        System.out.println("Первый массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Создаем второй массив только из четных элементов первого массива
        int[] evenArray = new int[n]; // Максимальное количество четных элементов - n
        int evenCount = 0; // Количество четных элементов
        for (int num : array) {
            if (num % 2 == 0) {
                evenArray[evenCount] = num;
                evenCount++;
            }
        }

        // Выводим второй массив на экран
        System.out.println("Второй массив (только четные элементы из первого массива):");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
