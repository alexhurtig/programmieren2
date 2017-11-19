package LE07.view;

import LE07.model.MCircle;
import LE07.model.MShape;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class VCircle {

    public static Circle getShape(MShape s) {
        MCircle scir = (MCircle) s;
        Circle rec = new Circle(scir.getxOrigin(),
                scir.getyOrigin(), scir.getRadius());
        rec.setFill(Color.rgb(255, 0, 0, 0.15));
        return rec;
    }
}