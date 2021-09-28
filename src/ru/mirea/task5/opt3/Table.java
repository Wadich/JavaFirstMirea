package ru.mirea.task5.opt3;

public class Table extends Furniture{
    public Table(String description, int weight, int price){
        super(description, weight, price);
    }

    @Override
    public String toString() {
        return "Table{" +
                "description='" + this.getDescription() + '\'' +
                ", weight=" + this.getWeight() +
                ", price=" + this.getPrice() +
                '}';
    }
}
