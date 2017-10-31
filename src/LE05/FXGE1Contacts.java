package LE05;

import java.util.ArrayList;

/**
 * This class shows graphically a list of hotels as provided
 * by the class model.AllHotels.
 * It uses a ScrollPane to scroll through the list, as well as
 * an embedded ScrollPane to scroll through the ratings of each
 * individual ratings of each hotel.
 * @author agathe merceron
 */

import LE05.model.AllContacts;
import LE05.model.Contact;
import LE05.model.Email;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXGE1Contacts extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {

            ScrollPane root = new ScrollPane();
            VBox box = new VBox();
            box.setSpacing(20);

            ArrayList<Contact> contacts = AllContacts.getDefaultList();
            for (Contact h : contacts ) {
                GridPane hotelPane = showHotel(h);
                box.getChildren().add(hotelPane);
            }

            root.setContent(box);
            Scene scene = new Scene(root,400,400);
            primaryStage.setScene(scene);
            primaryStage.show();

            //Button button = new Button("Enter your rating");

            //root.add(button, 0, 3);
            //button.setOnAction(e -> changeScene(primaryStage));

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private GridPane showHotel (Contact c) {
        GridPane root = new GridPane();
        // horizontal gap and vertical gap between columns and lines
        root.setHgap(10);
        root.setVgap(10);
        //limit the width of columns
        //gives a limit to column 0
        root.getColumnConstraints().add(new ColumnConstraints(100));
        //gives a limit to column 1
        root.getColumnConstraints().add(new ColumnConstraints(140));
        // an Insets defines the space around a region
        // here space will be added around the grid
        root.setPadding(new Insets(25, 25, 25, 25));

        Label hotel = new Label(c.getVorname()+"\n"
                + c.getNachname() +" " +c.getPhoto() + "\n"
                + c.getEmails());
        root.add(hotel, 0, 0);

        Image image = new Image (getClass().
                getResource("/LE05/resources/"+c.getPhoto()).toString());

        ImageView imageview = new ImageView(image);
        root.add(imageview, 1, 0);

        Label labelrating = new Label("current rating:");
        root.add(labelrating, 0, 1);
        Label currentrating = new Label(c.getEmails().toString());
        root.add(currentrating, 1, 1);
        root.add(showRatings(c), 0, 2, 2, 1);
        return root;
    }

    private ScrollPane showRatings(Contact c){
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(8, 8, 8, 8));
        int row = 0;

        ArrayList<Email> emails = c.getEmails();
        for (int i=0; i<c.getEmails().size(); i++) {
            Email e = emails.get(i);
            root.add(new Label("email: "), 0, row);
            root.add(new Label(e.getEmail()), 1, row);
            row++;
        }
        ScrollPane pane = new ScrollPane();
        pane.setContent(root);
        return pane;
    }

    /*private void changeScene(Stage stage){
        stage.setTitle("Dialog");
        GridPane root2 = new GridPane();
        root2.add(new Label("Your rating:"), 0, 0);
        TextField myrating = new TextField("write here");
        root2.add(myrating, 1, 0);
        myrating.setOnAction(e ->changeSceneBack(stage, myrating.getText()));
        stage.setScene(new Scene(root2, 300, 300));
    }

    private void changeSceneBack(Stage stage, String s){
        stage.setTitle("hotel02B");
        currentrating.setText(s);
        stage.setScene(scene);
    }*/
}