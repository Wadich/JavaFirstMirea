package ru.mirea.task5;


public abstract class Dish {
    private String type;
    private int diameter;
    private boolean isSafeForMicrowave;

    public Dish(String type, int diameter, boolean isSafeForMicrowave) {
        this.diameter = diameter;
        this.isSafeForMicrowave = isSafeForMicrowave;
        this.type = type;
    }


    public String getType() {
        return this.type;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public boolean isSafeForMicrowave() {
        return isSafeForMicrowave;
    }

    public void printInfo() {
        System.out.format("This %s dish is %d cm in diameter ", this.type, this.diameter);
        if (this.isSafeForMicrowave) {
            System.out.println("and is safe for using in microwave.");
        } else {
            System.out.println("and isn't safe for using in microwave.");
        }
    }
}
