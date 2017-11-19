package LE07.view;

import LE07.model.MShape;
import LE07.model.MSquare;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class VSquare {

    public static Rectangle getShape(MShape s) {
        MSquare ssqu = (MSquare) s;
        Rectangle squ = new Rectangle(ssqu.getxOrigin(),
                ssqu.getyOrigin(), ssqu.getSide(), ssqu.getSide());
        squ.setFill(Color.rgb(255, 0, 0, 0.15));
        return squ;
    }
}
