package LE07.view;

import LE07.controller.FormChanger;
import LE07.model.MAllShapes;
import LE07.model.MShape;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.reflect.Method;

public class VShapes {

    private static final String PREFIXMODEL = "model.M";
    private static final String PREFIXVIEW = "LE07.view.V";
    private static final String METHODNAME = "getShape";
    private static final String PARAMTYPE = "LE07.model.MShape";
    private EventTarget target;

    public void startView(Stage stage, MShape[] shapes) {
        try {
            Group root = new Group();

            for (MShape s : shapes) {
                String modelname = s.getClass().getName();
                String viewname = PREFIXVIEW + modelname.substring(PREFIXMODEL.length() + 5);
                Class<?> c = Class.forName(viewname);
                Method m = c.getMethod(METHODNAME, Class.forName(PARAMTYPE));
                Shape s1 = (Shape) m.invoke(null, s);

                Double calculation;
                if (s.area() > 0) {
                    calculation = s.area();
                } else {
                    calculation = s.circumference();
                }

                Text text = new Text(s.getxOrigin(), s.getyOrigin(),
                        "a: " + Double.toString(Math.round(calculation)));

                s1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                    /*public void changeX(ObservableValue observableValue, Object oldVal, Object newVal) {
                      observableValue = positionX;
                        System.out.println("Electric bill has changed!");
                    }

                    public void changeY(ObservableValue observableValue, Object oldVal, Object newVal) {
                        observableValue = positionY;
                        System.out.println("Electric bill has changed!");
                    }

                    ReadOnlyDoubleWrapper positionY = new ReadOnlyDoubleWrapper(s.getxOrigin());
                    ReadOnlyDoubleWrapper positionX = new ReadOnlyDoubleWrapper(s.getxOrigin());
    */
                    public void handle(MouseEvent event) {
                        target = event.getTarget();
                        String str = target.toString();
                        System.out.println("Tile pressed " + target.toString());
                        new FormChanger().FormChanger(s, str, stage);
                        //event.consume();
                    }
                });

                root.getChildren().addAll(s1, text);
            }

            Scene scene = new Scene(root, 600, 600);

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
