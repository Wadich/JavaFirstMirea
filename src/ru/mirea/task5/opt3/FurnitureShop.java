package ru.mirea.task5.opt3;

public class FurnitureShop {
    public static void main(String[] args){
        Chair test1 = new Chair("Beautiful thing to sit on",
                3, 1500);
        Table test2 = new Table("Thing with 4 legs, but unable to walk",
                15, 4500);

        System.out.println(test1.toString());
        System.out.println(test2.toString());
    }
}
