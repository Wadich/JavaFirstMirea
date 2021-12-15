package ru.mirea.task13.opt3;

public class ArrayList<E> {
    private E[] array;
    private int capacity;
    private int size;

    public ArrayList() {
        capacity = 10;
        size = 0;
        array = (E[]) new Object[10];
    }

    public boolean add(E element) {
        if (size + 1 >= capacity) {
            E[] temp = array;

            capacity = (int) Math.pow(size, 2);
            array = (E[]) new Object[capacity];


            for (int i = 0; i < size; i++) {
                array[i] = temp[i];
            }

            array[size++] = element;
        } else {
            array[++size] = element;
        }
        return true;
    }

    public void delete(int index) {
        E[] temp = array;
        array = (E[]) new Object[size - 1];

        for (int i = 0, j = 0; i < size; j++) {
            if (j != index) {
                array[i++] = temp[j];
            }
        }

        size--;
    }

    public E get(int index) {
        return array[index];
    }

    public int getSize() {
        return size;
    }

    public void insert(int index, E e) {
        array[index] = e;
    }
}
