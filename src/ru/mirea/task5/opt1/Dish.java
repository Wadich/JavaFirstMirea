package ru.mirea.task5.opt1;


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

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setSafeForMicrowave(boolean safeForMicrowave) {
        isSafeForMicrowave = safeForMicrowave;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "type='" + type + '\'' +
                ", diameter=" + diameter +
                ", isSafeForMicrowave=" + isSafeForMicrowave +
                '}';
    }
}
