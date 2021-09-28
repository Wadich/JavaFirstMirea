package ru.mirea.task7.opt1;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public Shape(){}

    public boolean isFilled() {
        return this.filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
