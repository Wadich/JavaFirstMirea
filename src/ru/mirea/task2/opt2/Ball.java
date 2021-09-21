package ru.mirea.task2.opt2;

public class Ball {
    private String color;
    private double weight;

    public Ball(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
