package ru.mirea.task12.opt2;

public class test {
    public static void main(String[] args) {
        Student[] IDNumber = new Student[12];

        System.out.println("Неотсортированный массив:\n");

        for (int i = 0; i < IDNumber.length; i++) {
            IDNumber[i] = new Student();
            IDNumber[i].setMark((int)(Math.random() * 10));
            System.out.print(IDNumber[i].toString() + "\n");
        }

        StudentSort.quick_sort(IDNumber);

        System.out.println("\nОтсортированный массив:\n");

        for (int i = 0; i < IDNumber.length; i++) {
            System.out.print(IDNumber[i].toString() + "\n");
        }
    }
}
