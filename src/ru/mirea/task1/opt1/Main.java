package ru.mirea.task1.opt1;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static int generateRandomInt(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.format("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void harmonicSeries(double counter){
        double harmonicNum = 0;
        for (double i=1; i <= counter; i++){
            harmonicNum = 1 / i;
            System.out.format("%.3f%n", harmonicNum);
        }
    }

    public static void sumOfSeries(){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0, i = 0;

        while(i < arr.length){
            sum += arr[i++];
        }
        System.out.format("Sum with 'while': %d%n", sum);
        sum = 0;

        for(int j=0; j < arr.length; j++ ){
            sum += arr[j];
        }
        System.out.format("Sum with 'for': %d%n", sum);
        sum = 0;
        i = 0;
        do {
            sum += arr[i++];
        }while (i < arr.length);
        System.out.format("Sum with 'do while': %d%n", sum);
    }

    public static void randomNumsSort(){
        int[] arr = new int[10];
        for(int i=0; i < arr.length; i++){
            arr[i] = generateRandomInt(0, 10);
        }
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
    }

    public static void main(String[] args) {
//        harmonicSeries(15);
//        sumOfSeries();
//        randomNumsSort();

    }
}
