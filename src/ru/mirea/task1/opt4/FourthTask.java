package ru.mirea.task1.opt4;

import java.util.Arrays;
import java.util.Random;

public class FourthTask {
    public static int generateRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static int generateRandomIntMath(int min, int max){
        return min + (int) (Math.random() * max);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = generateRandomInt(0, 10);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = generateRandomIntMath(0, 10);
        }

        System.out.println("non-sorted array, generated with class Random");
        printArray(arr1);
        Arrays.sort(arr1);
        System.out.println("sorted array");
        printArray(arr1);
        System.out.println("non-sorted array, generated with Math.random()");
        printArray(arr2);
        Arrays.sort(arr2);
        System.out.println("sorted array");
        printArray(arr2);
    }
}
