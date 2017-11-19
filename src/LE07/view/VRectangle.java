package LE07.view;

import LE07.model.MRectangle;
import LE07.model.MShape;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class VRectangle {

    public static Rectangle getShape(MShape s) {
        MRectangle srec = (MRectangle) s;
        Rectangle rec = new Rectangle(srec.getxOrigin(),
                srec.getyOrigin(), 2 * srec.getxDelta(), 2 * srec.getyDelta());
        rec.setFill(Color.rgb(255, 0, 0, 0.15));
        return rec;
    }
}