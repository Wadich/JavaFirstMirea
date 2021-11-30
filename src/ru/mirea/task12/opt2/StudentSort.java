package ru.mirea.task12.opt2;

public class StudentSort implements Comparator{

    @Override
    public void sort(Student[] arr, int low, int high) {
        if (arr.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student mid = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i].getMark() > mid.getMark()) {
                i++;
            }

            while (arr[j].getMark() < mid.getMark()) {
                j--;
            }

            if (i <= j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sort(arr, low, j);

        if (high > i)
            sort(arr, i, high);
    }

    static public void quick_sort(Student[] arr) {
        (new StudentSort()).sort(arr, 0, arr.length - 1);
    }
}