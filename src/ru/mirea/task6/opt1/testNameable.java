package ru.mirea.task6.opt1;

public class testNameable {
    public static void main(String[] args){
        Cars test1 = new Cars("IS IT A SUPRA?");
        Book test2 = new Book("Bookn't");

        System.out.println(test1.toString());
        System.out.println(test2.toString());
    }
}
