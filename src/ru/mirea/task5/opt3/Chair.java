package ru.mirea.task5.opt3;

public class Chair extends Furniture{
    public Chair(String description, int weight, int price){
        super(description, weight, price);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "description='" + this.getDescription() + '\'' +
                ", weight=" + this.getWeight() +
                ", price=" + this.getPrice() +
                '}';
    }
}
