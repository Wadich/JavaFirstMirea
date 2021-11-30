package ru.mirea.task12.opt3;

import ru.mirea.task12.opt2.Student;

public class test {
    public static void main(String[] args) {
        Student[] st1 = new Student[12];
        Student[] st2 = new Student[12];
        Student[] st3;

        System.out.println("Неотсортированный массив st1:\n");

        for (int i = 0; i < st1.length; i++) {
            st1[i] = new Student();
            st1[i].setMark((int)(Math.random() * 10));
            System.out.print(st1[i].toString() + "\n");
        }

        System.out.println("Неотсортированный массив st2:\n");

        for (int i = 0; i < st2.length; i++) {
            st2[i] = new Student();
            st2[i].setMark((int)(Math.random() * 10));
            System.out.print(st2[i].toString() + "\n");
        }

        st3 = MergeSort.sort(st1, st2);

        System.out.println("\nОтсортированный массив st3:\n");

        for (int i = 0; i < st3.length; i++) {
            System.out.print(st3[i].toString() + "\n");
        }
    }
}