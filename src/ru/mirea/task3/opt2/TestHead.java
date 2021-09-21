package ru.mirea.task3.opt2;

public class TestHead {
    public static void main(String[] args){
        Head testHead = new Head(175, 75, 43, true);
        System.out.println(testHead.isHair());
        System.out.println(testHead.getIq());
        System.out.println(testHead.getHeight());
        System.out.println(testHead.getWeight());
        System.out.println(testHead.toString());
    }
}
