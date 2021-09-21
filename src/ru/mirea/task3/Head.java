package ru.mirea.task3;

public class Head extends Human {
    private int iq;
    private boolean isHair;

    public Head(double height, double weight, int iq, boolean isHair){
        super(height, weight);
        this.iq = iq;
        this.isHair = isHair;
    }

    public int getIq() {
        return iq;
    }

    public boolean isHair() {
        return isHair;
    }

    public void setHair(boolean hair) {
        isHair = hair;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
