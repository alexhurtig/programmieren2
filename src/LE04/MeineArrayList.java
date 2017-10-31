package LE04;

import java.util.ArrayList;

public class MeineArrayList<E> {

    private E[] list;
    private int size;
    private int capacity;
    private int increment;

    public MeineArrayList(int c, int inc) {
        capacity = c;
        list = (E[]) new Object[c];
        size = 0;
        increment = inc;
    }

    public void newList() {
        new MeineArrayList(0, 1);
    }

    public void addToList(E o) {
        if (size >= capacity) {
            capacity += increment;
            E[] e2 = (E[]) new Object[capacity];
            e2 = list;
            list = e2;
        }
        list[size++] = o;
    }

    public void delete(E o) {
        for (int x = 0; x < size; x++) {
            if (list[x] == o) {
                list[x] = null;
            }
        }
    }

    public void deleteWholeList() {
        new MeineArrayList(0,1);
    }

    public void readAll() {
        for (int x = 0; x < size; x++) {
            System.out.println(list[x]);
        }
    }

    public int getSize() {
        return size;
    }

}