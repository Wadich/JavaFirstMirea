package ru.mirea.task6.opt2;

public class testPriceable {
    public static void main(String[] args){
        Cars test1 = new Cars(99999999);
        Book test2 = new Book(150);

        System.out.println(test1.toString());
        System.out.println(test2.toString());
    }
}
