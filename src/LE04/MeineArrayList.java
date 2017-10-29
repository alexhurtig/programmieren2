package LE04;

import java.util.ArrayList;

public class MeineArrayList<E> {

    private E[] list;
    private int size;
    private int capacity;
    private int increment;

// with initial capacity c
    public MeineArrayList(int c, int inc) {
        capacity = c;
        list = (E[]) new Object[c];
        size = 0;
        increment = inc;
    }

    public Object[] newList(){
        Object[] liste = new Object[0];
        return liste;
    }

    public static Object[] addToList(Object[] liste, Object neuesElement){
        liste[liste.length +1] = neuesElement;
        return liste;
    }

    public Object[] delete(int what, Object[] liste) {
        liste[what] = null;
        return liste;
    }

    public Object[] deleteWholeList(Object[] liste){
        liste = new Object[0];
        return liste;
    }

    public void readAll(Object[] liste) {
        int x = 0;
        while (x < liste.length) {
            String[] neuesArray = (String[]) liste[x];
            System.out.print(neuesArray[0]);
            System.out.println(neuesArray[1]);
            x++;
        }
    }

    public int getSize(MeineArrayList<E> liste){
        return liste.size;
    }





}