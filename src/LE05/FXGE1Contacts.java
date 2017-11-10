package LE05;

import java.util.ArrayList;

import LE05.model.AllContacts;
import LE05.model.Contact;
import LE05.model.Email;
import LE05.view.ShowContacts;
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

    private ArrayList<Contact> contacts = AllContacts.createList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        new ShowContacts().mainStage(primaryStage);

    }
}