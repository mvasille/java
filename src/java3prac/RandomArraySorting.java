package java3prac;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySorting {
    public static void main(String[] args) {
        // Создание массива и его размер
        int arraySize = 10;
        double[] randomArrayMath = new double[arraySize];
        double[] randomArrayRandom = new double[arraySize];

        // Заполнение массива с использованием Math.random()
        System.out.println("Массив, сгенерированный с использованием Math.random():");
        for (int i = 0; i < arraySize; i++) {
            randomArrayMath[i] = Math.random();
            System.out.println(randomArrayMath[i]);
        }

        // Заполнение массива с использованием класса Random
        Random random = new Random();
        System.out.println("\nМассив, сгенерированный с использованием класса Random:");
        for (int i = 0; i < arraySize; i++) {
            randomArrayRandom[i] = random.nextDouble();
            System.out.println(randomArrayRandom[i]);
        }

        // Сортировка массивов
        Arrays.sort(randomArrayMath);
        Arrays.sort(randomArrayRandom);

        // Вывод отсортированных массивов
        System.out.println("\nОтсортированный массив, сгенерированный с использованием Math.random():");
        for (double num : randomArrayMath) {
            System.out.println(num);
        }

        System.out.println("\nОтсортированный массив, сгенерированный с использованием класса Random:");
        for (double num : randomArrayRandom) {
            System.out.println(num);
        }
    }
}

