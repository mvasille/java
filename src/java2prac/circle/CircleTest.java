package java2prac.circle;

public class CircleTest {
    public static void main(String[] args) {
        // Создаем две окружности
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.0);

        // Выводим радиус, площадь и длину окружности каждой окружности
        System.out.println("Circle 1 - Радиус: " + circle1.getRadius());
        System.out.println("Circle 1 - Площадь: " + circle1.calculateArea());
        System.out.println("Circle 1 - Длина окружности: " + circle1.calculateCircumference());

        System.out.println("Circle 2 - Радиус: " + circle2.getRadius());
        System.out.println("Circle 2 - Площадь: " + circle2.calculateArea());
        System.out.println("Circle 2 - Длина окружности: " + circle2.calculateCircumference());

        // Сравниваем окружности
        if (circle1.isEqualTo(circle2)) {
            System.out.println("Окружности равны по радиусу.");
        } else {
            System.out.println("Окружности разные по радиусу.");
        }
    }
}
