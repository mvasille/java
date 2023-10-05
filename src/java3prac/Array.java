package java3prac;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        // Заполнение массива случайными числами от 10 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        // Вывод массива на экран
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Проверка, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
