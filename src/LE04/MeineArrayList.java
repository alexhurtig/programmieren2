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

    public ArrayList<E[]> newList(){
        ArrayList<E[]> liste = new ArrayList<>();
        return liste;
    }

    public ArrayList<E[]> addToList(ArrayList<E[]> liste, Object neuesElement){
        liste.add((E[]) neuesElement);
        return liste;
    }

    public ArrayList<E[]> delete(Object what, ArrayList<E[]> liste) {
        liste.remove(what);
        return liste;
    }

    public ArrayList<E[]> deleteWholeList(ArrayList<E[]> liste){
        liste = newList();
        return liste;
    }

    public void readAll(ArrayList<E[]> liste) {
        System.out.println(liste.toString());
    }

    public int getSize(ArrayList<E[]> liste){
        return liste.size();
    }





}