package java7prac.math;

public class Main {
    public static void main(String[] args) {
        MathCalculable mathFunctions = new MathFunc();

        double result1 = mathFunctions.power(2, 3); // 2^3 = 8
        System.out.println("2^3 = " + result1);

        double result2 = mathFunctions.complexAbsolute(3, 4); // Модуль комплексного числа 3 + 4i
        System.out.println("|3 + 4i| = " + result2);

        double circumference = 2 * MathCalculable.PI * 5; // Длина окружности с радиусом 5
        System.out.println("Длина окружности с радиусом 5: " + circumference);
    }
}