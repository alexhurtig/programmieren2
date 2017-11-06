package LE05.model;

/**
 * An object of this class represents a rating of an item.
 * A rating is a number between 1 and 5
 * and  may have a comment
 * @author agathe merceron
 *
 */

public class Email {
    private String email;

    public Email (String email) {
     this.email = email;
    }
    
    public String getEmail(){
     return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
     return email;
    }
}
