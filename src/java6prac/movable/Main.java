package java6prac.movable;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        MovableCircle circle = new MovableCircle(3, 3, 2, 2, 5);

        System.out.println("Начальный центр: " + point);
        System.out.println("Начальная окружность: " + circle);

        point.moveUp();
        circle.moveDown();

        System.out.println("Центр после перемещения: " + point);
        System.out.println("Окружность после перемещения: " + circle);
    }
}
