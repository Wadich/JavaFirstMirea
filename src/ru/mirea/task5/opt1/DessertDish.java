package ru.mirea.task5.opt1;


public class DessertDish extends Dish {
    private boolean isForIceCream;

    public DessertDish(String type, int diameter, boolean isSafeForMicrowave, boolean isForIceCream) {
        super(type, diameter, isSafeForMicrowave);
        this.isForIceCream = isForIceCream;
    }

    @Override
    public String toString() {
        return "DessertDish{" +
                "type='" + this.getType() + '\'' +
                ", diameter=" + this.getDiameter() +
                ", isSafeForMicrowave=" + this.isSafeForMicrowave() +
                ", isForIceCream=" + this.isForIceCream +
                '}';
    }
}
