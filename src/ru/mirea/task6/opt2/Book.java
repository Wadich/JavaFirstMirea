package ru.mirea.task6.opt2;

public class Book implements Priceable {
    private final int price;

    public Book(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price='" + this.price + '\'' +
                '}';
    }
}
