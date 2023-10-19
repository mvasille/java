package java7prac.movable;
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр MovableRectangle
        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 20);

        // Перемещаем прямоугольник
        rectangle.moveUp();
        rectangle.moveRight();

        // Получаем координаты прямоугольника
        int x = rectangle.getX();
        int y = rectangle.getY();

        System.out.println("Новые координаты прямоугольника: (" + x + ", " + y + ")");
    }
}
