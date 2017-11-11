package LE06.view;

import LE06.model.MRectangle;
import LE06.model.MShape;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class VRectangle {

    public static Rectangle getShape(MShape s) {
        MRectangle srec = (MRectangle) s;
        Rectangle rec = new Rectangle(srec.getXOrigin(),
                srec.getYOrigin(), 2 * srec.getXDelta(), 2 * srec.getYDelta());
        rec.setFill(Color.rgb(255, 0, 0, 0.15));
        return rec;
    }
}