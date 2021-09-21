package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args){
        Ball test = new Ball(0.5, 0.6);
        Ball test2 = new Ball();
        System.out.println(test.getX());
        System.out.println(test.getY());
        test.move(0.4, 0.9);
        System.out.println(test.toString());
        test2.setX(0.99);
        test2.setY(0.99);
        System.out.println(test2.getX());
        System.out.println(test2.getY());
        test2.move(0.45, 0.95);
        System.out.println(test2.toString());
    }
}
