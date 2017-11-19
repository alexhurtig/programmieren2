package LE07.controller;

import LE07.model.MAllShapes;
import LE07.model.MShape;
import LE07.view.VShapes;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.reflect.Method;

public class Forms extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        MShape[] shapes = MAllShapes.getDefaultShapes();

        new VShapes().startView(primaryStage, shapes);
    }
}
