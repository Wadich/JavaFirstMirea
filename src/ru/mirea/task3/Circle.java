package ru.mirea.task3;

public class Circle {
    private double radius;
    private double x;
    private double y;

    public Circle(double radius, double x, double y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

}
