package ru.mirea.task1.opt1;

public class FirstTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0, i = 0;

        while (i < arr.length) {
            sum += arr[i++];
        }
        System.out.format("Sum with 'while': %d%n", sum);
        sum = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.format("Sum with 'for': %d%n", sum);
        sum = 0;
        i = 0;
        do {
            sum += arr[i++];
        } while (i < arr.length);
        System.out.format("Sum with 'do while': %d%n", sum);
    }
}
