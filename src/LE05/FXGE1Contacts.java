package LE05;

import LE05.model.AllContacts;
import LE05.model.Contact;
import LE05.view.ShowContacts;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

public class FXGE1Contacts extends Application {

    private ArrayList<Contact> contacts = AllContacts.createList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        new ShowContacts().mainStage(primaryStage);

    }
}