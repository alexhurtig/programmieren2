package prae2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CheckBoxShow extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  private int boxen = 5;

  @Override
  public void start(Stage primaryStage) {

    try {
      GridPane root = new GridPane();
      root.add(new Label(), 1, 1);

      for (int i = 1; i <= boxen; i++) {
        CheckBox box = new CheckBox(Integer.toString(i));
        root.add(box, i, 2);
        box.setOnAction(e -> {
          if (box.isSelected()) {
            box.setTextFill(Color.RED);
          } else {
            box.setTextFill(Color.BLACK);
          }
        });
      }

      Scene scene = new Scene(root, 600, 600);

      primaryStage.setScene(scene);
      primaryStage.show();

    } catch (Exception e) {
      e.printStackTrace();
    }


  }
}
