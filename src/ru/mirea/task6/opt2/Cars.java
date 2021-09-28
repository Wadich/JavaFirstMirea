package ru.mirea.task6.opt2;

public class Cars implements Priceable {
    private final int price;

    public Cars(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "price='" + this.price + '\'' +
                '}';
    }
}
