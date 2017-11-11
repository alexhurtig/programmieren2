package LE06;

import LE06.model.MAllShapes;
import LE06.model.MShape;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.lang.reflect.Method;

public class Forms extends Application {

    private static final String PREFIXMODEL = "model.M";
    private static final String PREFIXVIEW = "LE06.view.V";
    private static final String METHODNAME = "getShape";
    private static final String PARAMTYPE = "LE06.model.MShape";


    @Override
    public void start(Stage primaryStage) {
        try {
            Group root = new Group();
            MShape[] shapes = MAllShapes.getDefaultShapes();

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

                Text text = new Text(s.getXOrigin(), s.getYOrigin(),
                        "a: " + Double.toString(Math.round(calculation)));

                root.getChildren().addAll(s1, text);
            }

            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
