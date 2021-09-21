package ru.mirea.task3.opt2;

public class Leg extends Human {
    private int size;

    public Leg(double height, double weight, int size){
        super(height, weight);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "Leg{" +
                "height='" + this.getHeight() + '\'' +
                ", weight='" + this.getWeight() + '\'' +
                ", size='" + this.size +
                '}';
    }
}
