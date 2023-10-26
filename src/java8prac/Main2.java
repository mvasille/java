package java8prac;

public class Main2 {
    public static void main(String[] args) {
        int n = 17; // Замените на число, которое вы хотите проверить на простоту
        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Рекурсивная функция для проверки числа на простоту
    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false; // 1 и отрицательные числа не являются простыми
        }
        if (divisor * divisor > n) {
            return true; // Число простое, если не найдены делители меньше или равные его квадратному корню
        }
        if (n % divisor == 0) {
            return false; // Найден делитель, число не является простым
        }
        return isPrime(n, divisor + 1); // Попробовать следующий делитель
    }
}
