package ru.mirea.task5.opt1;

public class SoupDish extends Dish {
    private final int depth;

    public SoupDish(String type, int diameter, boolean isSafeForMicrowave, int depth) {
        super(type, diameter, isSafeForMicrowave);
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "SoupDish{" +
                "type='" + this.getType() + '\'' +
                ", diameter=" + this.getDiameter() +
                ", isSafeForMicrowave=" + this.isSafeForMicrowave() +
                ", depth=" + this.depth +
                '}';
    }
}
