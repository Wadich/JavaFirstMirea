package ru.mirea.task1.opt5;

public class FifthTask {
    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 10 = " + calculateFactorial(10));
    }
}
