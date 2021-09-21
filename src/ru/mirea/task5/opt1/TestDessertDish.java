package ru.mirea.task5.opt1;

public class TestDessertDish {
    public static void main(String[] args){
        DessertDish test = new DessertDish("testType", 15,
                true, false);
        System.out.println(test.toString());
    }
}
