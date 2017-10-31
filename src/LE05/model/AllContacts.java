package LE05.model;

import java.util.ArrayList;

public class AllContacts {

    public static ArrayList<Contact> getDefaultList(){
        ArrayList<Contact> hotels = new ArrayList<>();
        hotels.add(Contact.getDefaultContact());
        //I am lazy; of course here create different hotels
        hotels.add(Contact.getDefaultContact());
        return hotels;
    }

    public static void main(String[] args) {
        ArrayList<Contact> ibises = AllContacts.getDefaultList();
        System.out.println(ibises);
    }
}