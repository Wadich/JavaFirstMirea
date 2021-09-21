package ru.mirea.task1.opt2;

public class SecondTask {
    public static void main(String[] args) {
        int i=1;
        for (String str : args) {
            System.out.println("аргумент №" + i + " = " + str);
            i++;
        }
    }
}
