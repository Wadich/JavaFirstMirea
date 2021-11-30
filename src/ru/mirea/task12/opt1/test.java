package ru.mirea.task12.opt1;


public class test {
    public static void main(String[] args) {
        student[] IDNumber = new student[12];

        System.out.println("Неотсортированный массив:\n");

        for (int i = 0; i < IDNumber.length; i++) {
            IDNumber[i] = new student();
            IDNumber[i].setId((int)(Math.random() * 10));
            System.out.print(IDNumber[i].toString() + "\n");
        }

        sort.sort(IDNumber);

        System.out.println("\nОтсортированный массив:\n");

        for (int i = 0; i < IDNumber.length; i++) {
            System.out.print(IDNumber[i].toString() + "\n");
        }
    }
}
