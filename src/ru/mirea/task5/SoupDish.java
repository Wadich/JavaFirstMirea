package ru.mirea.task5;

public class SoupDish extends Dish{
    private int depth;

    public SoupDish(String type, int diameter, boolean isSafeForMicrowave, int depth){
        super(type, diameter, isSafeForMicrowave);
        this.depth = depth;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.format("Depth is %d.%n", this.depth);
    }
}
