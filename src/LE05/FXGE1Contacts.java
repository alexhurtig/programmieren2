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

    private Label currentrating;
    private Label contactMails;
    private Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {

            GridPane root1 = new GridPane();

            ScrollPane root2 = new ScrollPane();
            VBox box = new VBox();
            box.setSpacing(20);

            Button button = new Button("Neuen Kontakt hinzufügen!");

            root1.add(button, 0, 1);
            button.setOnAction(e -> changeScene(primaryStage));

            root1.add(root2, 0,3);

            ArrayList<Contact> contacts = AllContacts.getDefaultList();
            for (Contact c : contacts ) {
                GridPane hotelPane = showContacts(c);
                box.getChildren().add(hotelPane);
            }

            root2.setContent(box);
            Scene scene = new Scene(root1,600,600);
            primaryStage.setScene(scene);
            primaryStage.show();



        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private GridPane showContacts (Contact c) {
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.getColumnConstraints().add(new ColumnConstraints(100));
        root.getColumnConstraints().add(new ColumnConstraints(140));


        root.setPadding(new Insets(25, 25, 25, 25));

        Label contact = new Label(c.getVorname()+"\n"
                + c.getNachname() +" " +c.getPhoto() + "\n"
                + c.getEmails());
        root.add(contact, 0, 0);

        Image image = new Image (getClass().
                getResource("/LE05/resources/" + c.getPhoto()).toString());

        ImageView imageview = new ImageView(image);
        root.add(imageview, 0, 1);

        Label labelvorname = new Label("Vorname:");
        root.add(labelvorname, 0, 1);

        Label contactMails = new Label(c.getEmails().toString());

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

    private void changeScene(Stage stage){
        stage.setTitle("Dialog");
        GridPane root2 = new GridPane();

        root2.add(new Label("Vorname:"), 0, 0);
        TextField firstname = new TextField("Vorname");
        root2.add(firstname, 1, 0);
        //firstname.setOnAction(e ->changeSceneBack(stage, firstname.getText()));

        root2.add(new Label("Nachname:"), 0, 1);
        TextField lastname = new TextField("Nachname");
        root2.add(lastname, 1, 1);
        //lastname.setOnAction(e->changeSceneBack(stage, lastname.getText()));

        root2.add(new Label("Bild:"), 0, 2);
        TextField picture = new TextField("Bild");
        root2.add(picture, 1, 2);
        //picture.setOnAction(e->changeSceneBack(stage, picture.getText()));

        root2.add(new Label("Email:"), 0, 2);
        TextField email = new TextField("Email");
        root2.add(email, 1, 2);
        //email.setOnAction(e->changeSceneBack(stage, email.getText()));

        Button adder = new Button("Hinzufügen");
        root2.add(adder, 0,3);
        adder.setOnAction(e->changeSceneBack(stage, firstname.getText(), lastname.getText(), picture.getText(), email.getText()));

        stage.setScene(new Scene(root2, 300, 300));
    }

    private void changeSceneBack(Stage stage, String f, String l, String p, String e){
        stage.setTitle("hotel02B");
        Contact c = new Contact(f,l,p);
        Email email = new Email(e);
        email.setEmail(e);
        stage.setScene(scene);
    }
}