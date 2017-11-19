package LE07.view;

import LE07.controller.FormChanger;
import LE07.model.MShape;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VFormChanger {

    private TextField enterXPosition;
    private TextField enterYPosition;
    private TextField enterHeight;
    private TextField enterWidth;

    public Stage enterRatingStage(MShape shape, String title, Stage stage) {

        stage.setTitle(title);

        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(8, 8, 8, 8));
        root.getColumnConstraints().add(new ColumnConstraints(250));
        root.getColumnConstraints().add(new ColumnConstraints(250));

        Label xPosition = new Label("Neue X Position: ");
        root.add(xPosition, 0, 0);
        enterXPosition = new TextField(shape.toStringXOrigin());
        root.add(enterXPosition, 1, 0);

        Label yPosition = new Label("Neue Y Position: ");
        root.add(yPosition, 0, 1);
        enterYPosition = new TextField(shape.toStringYOrigin());
        root.add(enterYPosition, 1, 1);

        Label height = new Label("Neue Höhe: ");
        root.add(height, 0, 2);
        enterHeight = new TextField(shape.toStringHeight());
        root.add(enterHeight, 1, 2);

        Label width = new Label("Neue Breite: ");
        root.add(width, 0, 3);
        enterWidth = new TextField(shape.toStringWidth());
        root.add(enterWidth, 1, 3);

        Label info = new Label();
        info.setMaxWidth(300);
        root.add(info, 0, 5);

        Button submit = new Button("submit");
        submit.setOnAction(e -> FormChanger.checkValues(shape, enterXPosition, enterYPosition, enterHeight, enterWidth, xPosition, yPosition, height, width, info, stage));
        root.add(submit, 0, 4);

        stage.setScene(new Scene(root, 450, 400));
        stage.show();
        return stage;
    }
}
