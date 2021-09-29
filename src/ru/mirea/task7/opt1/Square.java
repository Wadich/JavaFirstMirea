package ru.mirea.task7.opt1;

public class Square extends Rectangle {
    public Square(){}
    public Square(double side){
        this.setLength(side);
        this.setWidth(side);
    }
    public Square(double side, String color, boolean filled){
        this.setColor(color);
        this.setFilled(filled);
        this.setLength(side);
        this.setWidth(side);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + this.getSide() +
                '}';
    }
}
