package ru.mirea.task3.opt2;

public class TestLeg {
    public static void main(String[] args){
        Leg testLeg = new Leg(175, 75, 43);
        testLeg.setSize(42);
        System.out.println(testLeg.getSize());
        System.out.println(testLeg.getHeight());
        System.out.println(testLeg.getWeight());
        System.out.println(testLeg.toString());
    }
}
