package ru.mirea.task2.opt1;

public class Shape {
    private String type;
    private int cornersNum;

    public Shape(String type, int cornersNum){
        this.type = type;
        this.cornersNum = cornersNum;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                ", cornersNum=" + cornersNum +
                '}';
    }
}
