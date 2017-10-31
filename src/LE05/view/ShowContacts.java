package LE05.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowContacts extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {

            VBox root = new VBox();
            Label userlabel = new Label("Vorname");
            TextField usertext = new TextField();
            HBox hbox1 = new HBox();
            hbox1.setPadding(new Insets(15, 15, 15, 15));
            hbox1.setSpacing(15);
            hbox1.getChildren().addAll(userlabel, usertext);
            root.getChildren().add(hbox1);

            Label psswd = new Label("password");
            // when the program runs
            //wait a while for the tooltip to be shown
            Tooltip ptool = new Tooltip("password should have at least 8 characters");
            psswd.setTooltip(ptool);
            // a Tooltip can also be associated to any Control-Object like this:
            // Tooltip.install(psswd, ptool);
            PasswordField psswdF = new PasswordField();
            psswdF.setPromptText("password");


            HBox hbox2 = new HBox();
            //space between hbox and window
            hbox2.setPadding(new Insets(15, 15, 15, 15));
            //space between the elements in the hbox
            hbox2.setSpacing(15);
            hbox2.getChildren().addAll(psswd, psswdF);
            root.getChildren().add(hbox2);

            Label address = new Label("Enter your address street"+
                    "\n zip code and city \n country");
            TextArea addresstxt = new TextArea();
            //how big the area should be
            //when more is entered scrolling begins automatically
            addresstxt.setPrefColumnCount(12);
            addresstxt.setPrefRowCount(3);
            HBox hbox3 = new HBox();
            //space between hbox and window
            hbox3.setPadding(new Insets(15, 15, 15, 15));
            //space between the elements in the hbox
            hbox3.setSpacing(15);
            hbox3.getChildren().addAll(address, addresstxt);
            root.getChildren().add(hbox3);

            Scene scene = new Scene(root,400,200);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
