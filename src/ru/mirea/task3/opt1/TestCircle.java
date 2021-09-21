package ru.mirea.task3.opt1;

public class TestCircle {
    public static void main(String[] args) {
        Circle test = new Circle(4.0, 1, 1);
        System.out.println(test.getX());
        System.out.println(test.getY());
        System.out.println(test.getRadius());
        test.setRadius(15.0);
        test.setX(1.5);
        test.setY(2.0);
        System.out.println(test.getX());
        System.out.println(test.getY());
        System.out.println(test.getRadius());
    }
}
