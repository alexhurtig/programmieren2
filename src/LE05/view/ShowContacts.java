package LE05.view;

import LE05.model.AllContacts;
import LE05.model.Contact;
import LE05.model.Email;
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

import java.util.ArrayList;

public class ShowContacts {

    private ArrayList<Contact> contacts = AllContacts.createList();

    public void mainStage(Stage primaryStage) throws Exception {
        try {
            GridPane root1 = new GridPane();

            ScrollPane root2 = new ScrollPane();
            VBox box = new VBox();
            box.setSpacing(20);

            Button button = new Button("Neuen Kontakt hinzufügen!");

            root1.add(button, 0, 1);
            button.setOnAction(e -> changeScene(primaryStage));

            root1.add(root2, 0, 3);

            for (Contact c : contacts) {
                GridPane hotelPane = showContacts(c);
                box.getChildren().add(hotelPane);
            }

            root2.setContent(box);
            Scene scene = new Scene(root1, 600, 600);
            primaryStage.setScene(scene);
            primaryStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public GridPane showContacts(Contact c) {
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.getColumnConstraints().add(new ColumnConstraints(380));

        root.setPadding(new Insets(25, 25, 25, 25));

        Label contact = new Label("Vorname: " + c.getVorname() + "\n"
                + "Nachname: " + c.getNachname() + "\n");
        root.add(contact, 0, 0);

        Image image = new Image(getClass().
                getResource("/LE05/resources/" + c.getPhoto()).toString());

        ImageView imageview = new ImageView(image);
        root.add(imageview, 0, 1);

        Label labelvorname = new Label("Vorname:");
        root.add(labelvorname, 0, 1);

        root.add(showEmails(c), 0, 2, 2, 1);
        return root;
    }

    private ScrollPane showEmails(Contact c) {
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(8, 8, 8, 8));
        int row = 0;

        ArrayList<Email> emails = c.getEmails();
        for (int i = 0; i < c.getEmails().size(); i++) {
            Email e = emails.get(i);
            root.add(new Label("email: "), 0, row);
            root.add(new Label(e.getEmail()), 1, row);
            row++;
        }
        ScrollPane pane = new ScrollPane();
        pane.setContent(root);
        return pane;
    }

    public void changeScene(Stage stage) {
        stage.setTitle("Dialog");
        GridPane root2 = new GridPane();

        root2.add(new Label("Vorname:"), 0, 0);
        TextField firstname = new TextField("Vorname");
        root2.add(firstname, 1, 0);

        root2.add(new Label("Nachname:"), 0, 1);
        TextField lastname = new TextField("Nachname");
        root2.add(lastname, 1, 1);

        root2.add(new Label("Bild:"), 0, 2);
        TextField picture = new TextField("Bild.jpg");
        root2.add(picture, 1, 2);

        root2.add(new Label("Email:"), 0, 3);
        TextField email = new TextField("Email");
        root2.add(email, 1, 3);

        Button adder = new Button("Hinzufügen");
        root2.add(adder, 0, 4);
        adder.setOnAction(e -> changeSceneBack(stage, firstname.getText(), lastname.getText(), picture.getText(), email.getText()));

        stage.setScene(new Scene(root2, 300, 300));
    }

    private void changeSceneBack(Stage stage, String f, String l, String p, String e) {
        String eml;
        if (e.contains("@") && !e.startsWith("@") && !e.endsWith("@")) {
            eml = e;
        } else {
            eml = "";
        }
        stage.setTitle("add Contact to List");
        Contact c = Contact.createContact(f, l, p, eml);
        AllContacts.addToList(contacts, c);
        try {
            mainStage(stage);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
