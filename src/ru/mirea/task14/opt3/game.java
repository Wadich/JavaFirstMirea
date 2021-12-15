package ru.mirea.task14.opt3;

import java.util.ArrayDeque;
import java.util.Deque;

public class game {
    private int count;
    private Deque<Integer> deck1;
    private Deque<Integer> deck2;

    private game() {
    }

    public game(int[] arr1, int[] arr2) {
        deck1 = new ArrayDeque<>();
        deck2 = new ArrayDeque<>();

        for (int i = 0; i < arr1.length; i++) {
            deck1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            deck2.add(arr2[i]);
        }
    }

    public String gameplay() {
        int temp1, temp2;

        while (++count < 106) {
            temp1 = deck1.poll();
            temp2 = deck2.poll();

            if (temp1 == 0 && temp2 == 9) {
                deck1.add(temp1);
                deck1.add(temp2);
            } else if (temp1 == 9 && temp2 == 0) {
                deck2.add(temp2);
                deck2.add(temp1);
            } else if (temp1 > temp2) {
                deck1.add(temp1);
                deck1.add(temp2);
            } else {
                deck2.add(temp2);
                deck2.add(temp1);
            }

            if (deck1.isEmpty()) {
                return "second " + count;
            } else if (deck2.isEmpty()) {
                return "first " + count;
            }
        }

        return "botva";
    }
}
