package ru.mirea.task3.opt2;

public class Human {
    private double height;
    private double weight;

    public Human(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Human{" +
                "height='" + this.height + '\'' +
                ", weight='" + this.weight +
                '}';
    }
}
