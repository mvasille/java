package java8prac;

public class Main {
    public static void main(String[] args) {
        int k = 3; // Количество цифр в числе
        int s = 15; // Заданная сумма цифр
        int count = countNumbers(k, s);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + " равно " + count);
    }

    // Функция для подсчета количества k-значных чисел с заданной суммой цифр
    public static int countNumbers(int k, int s) {
        if (s < 0 || s > 9 * k) {
            return 0; // Если сумма невозможна, вернуть 0
        }
        if (k == 1) {
            return 1; // Базовый случай: однозначное число
        }

        int count = 0;
        for (int i = 0; i <= 9; i++) {
            count += countNumbers(k - 1, s - i);
        }

        return count;
    }
}
