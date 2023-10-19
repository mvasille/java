package java7prac.movable;

public class MovableRectangle implements Movable {
    private int x;  // координата X верхнего левого угла прямоугольника
    private int y;  // координата Y верхнего левого угла прямоугольника
    private int width;
    private int height;

    // Конструктор класса
    public MovableRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Реализация методов интерфейса Movable
    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    // Другие методы для работы с прямоугольником
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}