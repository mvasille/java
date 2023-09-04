package java1prac;

public class FactCalc {
    // Метод для вычисления факториала числа
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 5; // Здесь можно указать любое целое неотрицательное число
        long factorial = calculateFactorial(number);

        System.out.println("Факториал числа " + number + " равен " + factorial);
    }
}
