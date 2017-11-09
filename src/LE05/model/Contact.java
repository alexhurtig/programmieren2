package LE05.model;

import java.util.ArrayList;

public class Contact {

    private String vorname;
    private String nachname;
    private String photo;
    private ArrayList<Email> emails;

    public Contact (String vorname, String nachname, String photo) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.photo = photo;
        emails = new ArrayList<>();
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getPhoto(){
        return photo;
    }

    public ArrayList<Email> getEmails(){
        return emails;
    }

    @Override
    public String toString(){
        return vorname + " " + nachname + " " + emails.toString();
    }

    public void addEmail(String email) {
        emails.add(new Email(email));
    }

    public static Contact createContact(String f, String l, String p, String e){
        Contact newContact = new Contact(f, l, p);
        newContact.addEmail(e);
        return newContact;
    }
}