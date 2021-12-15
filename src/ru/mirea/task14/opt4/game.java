package ru.mirea.task14.opt4;

import java.util.LinkedList;

public class game {
    private int count;
    private LinkedList<Integer> deck1;
    private LinkedList<Integer> deck2;

    private game() {
    }

    public game(int[] arr1, int[] arr2) {
        deck1 = new LinkedList<>();
        deck2 = new LinkedList<>();

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
            temp1 = deck1.getLast();
            temp2 = deck2.getLast();

            deck1.remove(deck1.size() - 1);
            deck2.remove(deck2.size() - 1);

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
