package LE06.view;

import LE06.model.MCircle;
import LE06.model.MRectangle;
import LE06.model.MShape;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class VCircle {

    public static Circle getShape(MShape s) {
        MCircle scir = (MCircle) s;
        Circle rec = new Circle(scir.getXOrigin(),
                scir.getYOrigin(), scir.getRadius());
        rec.setFill(Color.rgb(255, 0, 0, 0.15));
        return rec;
    }
}