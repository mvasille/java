package java2prac.ball;

import java2prac.ball.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();

        System.out.println(ball.toString());

        ball.setXY(2.5, 3.0);

        System.out.println(ball.toString());

        ball.move(1.0, -2.0);

        System.out.println(ball.toString());
    }
}
