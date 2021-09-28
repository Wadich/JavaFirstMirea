package ru.mirea.task5.opt3;

public abstract class Furniture {
    private String description;
    private int weight;
    private int price;

    public Furniture(String description, int weight, int price){
        this.description = description;
        this.weight = weight;
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "description='" + this.description + '\'' +
                ", weight=" + this.weight +
                ", price=" + this.price +
                '}';
    }
}
