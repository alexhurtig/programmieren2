package LE05.model;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private String street;
    private String number;
    private String zipcode;
    private String city;
    private String photo; //name of the file that contains the photo
    private float rating;
    private ArrayList<Rating> ratings;

    /**
     * creates a hotel with the given data.
     * The average rating is set to 0 and the list of ratings is empty.
     * @param name of the hotel
     * @param street the hotel is in
     * @param number of the hotel in the street
     * @param zipcode
     * @param city
     * @param photo name of the photo of this hotel
     */

    public Hotel (String name, String street, String number, String zipcode,
                  String city, String photo) {
        this.name = name;
        this.street = street;
        this.number = number;
        this.zipcode = zipcode;
        this.city = city;
        this.photo = photo;
        rating = 0;
        ratings = new ArrayList<>();
    }

    /**
     * getter for the name
     * @return the name of the hotel
     */

    public String getName() {
        return name;
    }

    /**
     * getter for the street
     * @return the street
     */

    public String getStreet(){
        return street;
    }

    /**
     * getter for the street number
     * @return the street number
     */

    public String getNumber(){
        return number;
    }

    /**
     * getter for the zipcode
     * @return the zipcode
     */

    public String getZipcode(){
        return zipcode;
    }

    /**
     * getter for the city
     * @return the city
     */

    public String getCity(){
        return city;
    }

    /**
     * getter for the name of the file that contains the photo
     * @return the name of the file that contains the photo
     */

    public String getPhoto(){
        return photo;
    }

    /**
     * getter for the current rating
     * @return the current rating
     */

    public float getRating(){
        return rating;
    }

    /**
     * getter for the list of ratings
     * @return the list of ratings
     */

    public ArrayList<Rating> getRatings(){
        return ratings;
    }

    @Override
    public String toString(){
        return name +" "+ street +" "+ number +" "+ zipcode+" "+city+" "+rating
                +"\n "+ratings.toString();
    }

    /*
     * an help method to recalculate the attribute rating as an average
     * of all individual ratings.
     */

    private void updateRating(){
        int sum = 0;
        for (Rating r : ratings) {
            sum += r.getRating();
        }
        // cast to have a float division
        rating = (sum / (float) ratings.size());
    }

    /**
     * adds a rating to the list
     * @param rating value of the rating should be between 1 and 5
     * if not, it will be changed to 3.
     * @param comment of this rating
     */

    public void addRating(int rating, String comment) {
        ratings.add(new Rating(rating, comment));
        updateRating();
    }

    /**
     * adds a rating to the list
     * @param rating value of the rating should be between 1 and 5
     * if not, it will be changed to 3.
     */

    public void addRating(int rating) {
        ratings.add(new Rating(rating));
        updateRating();
    }

    /**
     * creates a default hotel, mainly for testing purposes
     * @return a default hotel
     */

    public static Hotel getDefaultHotel(){
        Hotel ibis = new Hotel("ibis Styles Hotel Berlin", "Brunnenstraße", "1-2", "10119",
                "Berlin", "ibisMitteBerlin.jpg");
        ibis.addRating(4, "great");
        ibis.addRating(3, "ok");
        ibis.addRating(3);
        ibis.addRating(7);
        ibis.addRating(5, "very nice. I will come back soon and recommend it to anyone"
                +" who goes to Berlin for a few days");
        return ibis;
    }

    public static void main(String[] args) {
        Hotel ibis = Hotel.getDefaultHotel();
        System.out.println(ibis);
    }

}