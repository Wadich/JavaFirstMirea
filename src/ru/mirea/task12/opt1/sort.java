package ru.mirea.task12.opt1;

public class sort {
    static public void sort(student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            student current = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1].getId() > current.getId()) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = current;
        }
    }
}