package ru.mirea.task10.opt1;


import java.util.Scanner;

public class TaskPack {
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Enter number(from 1):\n> ");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.format("Incorrect number!\n");
            System.out.format("Enter number(from 1):\n> ");
            n = scanner.nextInt();
        }
        int counter = 0;
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (n - counter < i) {
                result += new String(new char[n - counter]).replace("\0", i + ", ");
                counter += n - counter;
            } else {
                result += new String(new char[i]).replace("\0", i + ", ");
                counter += i;
            }
        }
        System.out.println(result.substring(0, result.length() - 2));
    }


    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Enter number(from 1):\n> ");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.format("Incorrect number!\n");
            System.out.format("Enter number(from 1):\n> ");
            n = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.format("%d ", i);
        }
        System.out.println();
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Enter first number(from 1):\n> ");
        int A = scanner.nextInt();
        System.out.format("Enter second number(from 1):\n> ");
        int B = scanner.nextInt();
        while (A < 1 || B < 1) {
            System.out.format("Incorrect number!\n");
            System.out.format("Enter first number(from 1):\n> ");
            A = scanner.nextInt();
            System.out.format("Enter second number(from 1):\n> ");
            B = scanner.nextInt();
        }
        if (A > B) {
            for (int i = A; i <= B; i--) {
                System.out.format("%d ", i);
            }
        } else {
            for (int i = A; i <= B; i++) {
                System.out.format("%d ", i);
            }
        }
        System.out.println();
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Enter k number(from 1):\n> ");
        int k = scanner.nextInt();
        System.out.format("Enter s number(from 1):\n> ");
        int s = scanner.nextInt();
        while (k < 1 || s < 1) {
            System.out.format("Incorrect number!\n");
            System.out.format("Enter k number(from 1):\n> ");
            k = scanner.nextInt();
            System.out.format("Enter s number(from 1):\n> ");
            s = scanner.nextInt();
        }
        int tempSum = 0;
        int tempNum = 0;
        int resultCount = 0;

        for (int i = (int) Math.pow(10, k - 1); i < (int) Math.pow(10, k); i++) {
            tempNum = i;
            tempSum = 0;

            while (tempNum > 0) {
                tempSum += tempNum % 10;
                tempNum /= 10;
            }
//            System.out.format("tempSum %d; i %d\n", tempSum, i); // debug

            if (s == tempSum) resultCount++;

        }
        System.out.format("Number of matches of sums = %d", resultCount);
    }

    public static int recSum(int n){
        return n == 0 ? 0 : n % 10 + recSum(n/10) ;
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.format("Enter number(from 1):\n> ");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.format("Incorrect number!\n");
            System.out.format("Enter number(from 1):\n> ");
            n = scanner.nextInt();
        }
        System.out.format("Sum of digits of %d is %d", n, recSum(n));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        while (true) {
            System.out.format("\nEnter number of task (1-5) or 0 to exit:\n> ");
            n = in.nextInt();

            if (n == 0) {
                System.out.format("BB :)");
                return;
            }

            while (n < 1 && n > 5) {
                System.out.format("Incorrect number! Enter number of task (1-5) or 0 to exit:\n> ");
                n = in.nextInt();
            }

            switch (n) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
            }
        }
    }
}
