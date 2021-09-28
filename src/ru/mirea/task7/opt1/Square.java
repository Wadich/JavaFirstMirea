package ru.mirea.task7.opt1;

public class Square extends Rectangle {
    private double side;
    public Square(){}
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.setColor(color);
        this.setFilled(filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + this.side +
                '}';
    }
}
