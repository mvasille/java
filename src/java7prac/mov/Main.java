package java7prac.mov;

public class Main {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(0, 0, 2, 2); // Начальные координаты (0, 0), скорость (2, 2)
        MovablePoint point2 = new MovablePoint(5, 5, 2, 2); // Начальные координаты (5, 5), скорость (2, 2)

        Rectangle rectangle = new Rectangle(0, 0, 10, 10, 2, 2);

        // Вывод начальных координат верхней левой точки
        System.out.println("Начальные координаты верхней левой точки: (" + point1.getX() + ", " + point1.getY() + ")");

        // Перемещаем прямоугольник
        rectangle.moveUp();
        rectangle.moveRight();

        // Получаем новые координаты верхней левой точки
        int newX1 = rectangle.getX();
        int newY1 = rectangle.getY();

        System.out.println("Новые координаты верхней левой точки: (" + newX1 + ", " + newY1 + ")");

        // Проверяем скорость точек
        if (rectangle.SpeedTest()) {
            System.out.println("Точки имеют одинаковую скорость.");
        } else {
            System.out.println("Точки имеют разную скорость.");
        }
    }
}
