package java2prac.pointcircle;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int maxSize) {
        circles = new Circle[maxSize];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив полон, невозможно добавить больше окружностей.");
        }
    }

    public void displayCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println("Окружность " + (i + 1) + ": " + circles[i]);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);

        Point center1 = new Point(1.0, 2.0);
        Point center2 = new Point(3.0, 4.0);

        Circle circle1 = new Circle(center1, 2.5);
        Circle circle2 = new Circle(center2, 1.5);

        tester.addCircle(circle1);
        tester.addCircle(circle2);

        tester.displayCircles();
    }
}
