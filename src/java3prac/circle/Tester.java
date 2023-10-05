package java3prac.circle;
import java.util.Arrays;
import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int numberOfCircles;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        numberOfCircles = 0;
    }

    public void addCircle(Circle circle) {
        if (numberOfCircles < circles.length) {
            circles[numberOfCircles] = circle;
            numberOfCircles++;
        } else {
            System.out.println("Массив полон, невозможно добавить больше окружностей.");
        }
    }

    public Circle findSmallestCircle() {
        if (numberOfCircles == 0) {
            return null;
        }

        Circle smallestCircle = circles[0];
        for (int i = 1; i < numberOfCircles; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }

    public Circle findLargestCircle() {
        if (numberOfCircles == 0) {
            return null;
        }

        Circle largestCircle = circles[0];
        for (int i = 1; i < numberOfCircles; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }
        return largestCircle;
    }

    public void sortCirclesByRadius() {
        Arrays.sort(circles, 0, numberOfCircles, (circle1, circle2) -> {
            double radius1 = circle1.getRadius();
            double radius2 = circle2.getRadius();
            return Double.compare(radius1, radius2);
        });
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Point center = new Point(random.nextDouble(), random.nextDouble());
            double radius = random.nextDouble() * 10;
            Circle circle = new Circle(center, radius);
            tester.addCircle(circle);
        }

        System.out.println("Самая маленькая окружность: " + tester.findSmallestCircle());
        System.out.println("Самая большая окружность: " + tester.findLargestCircle());

        System.out.println("\nОкружности в порядке возрастания радиуса:");
        tester.sortCirclesByRadius();
        for (Circle circle : tester.circles) {
            if (circle != null) {
                System.out.println(circle);
            }
        }
    }
}
