package ru.mirea.task6;

public class Main {

    public static void main(String[] args) {
        Nameable car = new Cars("supra");
        Nameable book = new Book("War and peace");
        System.out.println(car.getName() + ", " + book.getName());
    }
}
