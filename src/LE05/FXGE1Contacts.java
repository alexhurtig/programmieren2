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

import LE05.model.AllHotels;
import LE05.model.Hotel;
import LE05.model.Rating;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXGE1Contacts extends Application{

    @Override
    public void start(Stage primaryStage) {
        try {

            ScrollPane root = new ScrollPane();
            VBox box = new VBox();
            box.setSpacing(20);

            ArrayList<Hotel> hotels = AllHotels.getDefaultList();
            for (Hotel h : hotels ) {
                GridPane hotelPane = showHotel(h);
                box.getChildren().add(hotelPane);
            }

            root.setContent(box);
            Scene scene = new Scene(root,400,400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private GridPane showHotel (Hotel h) {
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

        Label hotel = new Label(h.getName()+"\n"
                + h.getStreet() +" " +h.getNumber() + "\n"
                +h.getZipcode() + " " + h.getCity());
        root.add(hotel, 0, 0);

        Image image = new Image (getClass().
                getResource("/LE05/resources/"+h.getPhoto()).toString());

        ImageView imageview = new ImageView(image);
        root.add(imageview, 1, 0);

        Label labelrating = new Label("current rating:");
        root.add(labelrating, 0, 1);
        Label currentrating = new Label(Float.toString(h.getRating()));
        root.add(currentrating, 1, 1);
        root.add(showRatings(h), 0, 2, 2, 1);
        return root;
    }

    private ScrollPane showRatings(Hotel h){
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(8, 8, 8, 8));
        int row = 0;
        // the rows of root are dynamically allocated
        ArrayList<Rating> ratings = h.getRatings();
        for (int i=0; i<h.getRatings().size(); i++) {
            Rating r = ratings.get(i);
            root.add(new Label("rating: "), 0, row);
            root.add(new Label(Integer.toString(r.getRating())), 1, row);
            String c = r.getComment();
            if (!(c.equals(""))) {
                root.add(new Label(c), 0, ++row, 2, 1);
            }
            row++;
        }
        ScrollPane pane = new ScrollPane();
        pane.setContent(root);
        return pane;
    }

    public static void main(String[] args) {
        launch(args);
    }

}