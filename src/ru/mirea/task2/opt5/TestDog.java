package ru.mirea.task2.opt5;

import ru.mirea.task2.opt4.Dog;

public class TestDog {

    public static void main(String[] args) {
        int nameNum;
        int randomAge;
        Dog[] testDog = new Dog[10];
        String[] names = {"John", "Ted", "Freddy"};
        for (int i = 0; i < 10; i++) {
            nameNum = (int) (Math.random() * 2);
            randomAge = 1 + (int) (Math.random() * 15);
            testDog[i] = new Dog(names[nameNum], randomAge);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(testDog[i].toString());
        }
    }
}
