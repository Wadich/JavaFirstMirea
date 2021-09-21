package ru.mirea.task1.opt3;

public class ThirdTask {
    public static void main(String[] args) {
        int counter = 10;
        double harmonicNum = 0;
        for (int i = 1; i <= counter; i++) {
            harmonicNum = 1 / (double)i;
            System.out.format("№%d %.3f%n", i, harmonicNum);

        }
    }
}
