package LE05.model;

import java.util.ArrayList;

public class AllContacts {

    public static ArrayList<Contact> createList(){
        ArrayList<Contact> hotels = new ArrayList<>();
        return hotels;
    }

    public static ArrayList<Contact> getDefaultList(ArrayList<Contact> hotels){
        hotels.add(Contact.getDefaultContact());
        hotels.add(Contact.getDefaultContact());
        return hotels;
    }

    public static void addToList(ArrayList<Contact> l, Contact c){
        l.add(c);
    }
}