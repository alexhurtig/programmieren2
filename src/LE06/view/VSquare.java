package LE06.view;

import LE06.model.MCircle;
import LE06.model.MShape;
import LE06.model.MSquare;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class VSquare {

    public static Rectangle getShape(MShape s) {
        MSquare ssqu = (MSquare) s;
        Rectangle squ = new Rectangle(ssqu.getXOrigin(),
                ssqu.getYOrigin(), ssqu.getSide(), ssqu.getSide());
        squ.setFill(Color.rgb(255, 0, 0, 0.15));
        return squ;
    }
}
