package java8prac;

public class Main1 {
    public static void main(String[] args) {
        int N = 12345;
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }

    // Функция для вычисления суммы цифр числа
    public static int sumOfDigits(int N) {
        if (N == 0) {
            return 0; // Базовый случай: сумма цифр числа 0 равна 0
        } else {
            int lastDigit = N % 10; // Получаем последнюю цифру числа
            int remainingDigits = N / 10; // Убираем последнюю цифру из числа
            int sum = lastDigit + sumOfDigits(remainingDigits); // Рекурсивно считаем сумму оставшихся цифр
            return sum;
        }
    }
}
