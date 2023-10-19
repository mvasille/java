package java7prac.mov;

public class Rectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public Rectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public int getX() {
        return topLeft.getX();
    }

    @Override
    public int getY() {
        return topLeft.getY();
    }

    @Override
    public String toString() {
        return "TopLeft: " + topLeft.toString() + ", BottomRight: " + bottomRight.toString();
    }

    public boolean SpeedTest() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed() && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }
}