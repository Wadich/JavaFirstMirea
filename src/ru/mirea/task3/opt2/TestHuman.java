package ru.mirea.task3.opt2;

public class TestHuman {
    public static void main(String[] args){
        Human testHuman = new Human(175, 75);
        System.out.println(testHuman.getHeight());
        System.out.println(testHuman.getWeight());
        System.out.println(testHuman.toString());
    }
}
