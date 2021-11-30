package ru.mirea.task12.opt3;

import ru.mirea.task12.opt2.Student;

public class MergeSort {
    private static Student[] merge(Student[] arr1, Student[] arr2) {
        Student[] arrayC = new Student[arr1.length + arr2.length];

        int positionA = 0, positionB = 0;


        for (int i = 0; i < arrayC.length; i++) {
            if (positionA == arr1.length){
                arrayC[i] = arr2[i - positionB];
                positionB++;
            } else if (positionB == arr2.length) {
                arrayC[i] = arr1[i - positionA];
                positionA++;
            } else if (arr1[i - positionA].getMark() < arr2[i - positionB].getMark()) {
                arrayC[i] = arr1[i - positionA];
                positionB++;
            } else {
                arrayC[i] = arr2[i - positionB];
                positionA++;
            }
        }
        return arrayC;
    }

    private static Student [] sortArray(Student[] array_A){
        if (array_A == null) {
            return null;
        }

        if (array_A.length < 2) {
            return array_A;
        }

        Student [] array_B = new Student[array_A.length / 2];
        System.arraycopy(array_A, 0, array_B, 0, array_A.length / 2);

        Student [] array_C = new Student[array_A.length - array_A.length / 2];
        System.arraycopy(array_A, array_A.length / 2, array_C, 0, array_A.length - array_A.length / 2);

        array_B = sortArray(array_B);
        array_C = sortArray(array_C);

        return merge(array_B, array_C);
    }

    static public Student[] sort(Student[] arr1, Student[] arr2) {
        Student[] arr = new Student[arr1.length + arr2.length];

        int j;
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        j = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            arr[j++] = arr2[i];
        }

        if (arr == null) {
            return null;
        }
        if (arr.length < 2) {
            return arr;
        }

        Student[] arrayB = new Student[arr.length / 2];
        System.arraycopy(arr, 0, arrayB, 0, arr.length / 2);

        Student[] arrayC = new Student[arr.length - arr.length / 2];

        System.arraycopy(arr, arr.length / 2, arrayC, 0, arr.length - arr.length / 2);


        arrayB = sortArray(arrayB);
        arrayC = sortArray(arrayC);

        return merge(arrayB, arrayC);
    }
}
