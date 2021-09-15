package ru.mirea.task5;


public class DessertDish extends Dish {
    private boolean isForIceCream;

    public DessertDish(String type, int diameter, boolean isSafeForMicrowave, boolean isForIceCream) {
        super(type, diameter, isSafeForMicrowave);
        this.isForIceCream = isForIceCream;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        if (this.isForIceCream) {
            System.out.format("This plate is for ice cream%n");
        } else {
            System.out.format("This plate isn't for ice cream%n");
        }
    }
}
