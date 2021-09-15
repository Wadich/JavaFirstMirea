package ru.mirea.task5;


public class Main {

    public static void main(String[] args) {
        SoupDish bluePlate = new SoupDish("blue plate", 15, true, 5);
        bluePlate.printInfo();

        DessertDish greenPlate = new DessertDish("green plate", 7, false, true);
        greenPlate.printInfo();
    }
}
