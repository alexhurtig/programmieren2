package LE06.view;

import LE06.model.MCircle;
import LE06.model.MEllipse;
import LE06.model.MShape;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class VEllipse {

    public static Ellipse getShape(MShape s) {
        MEllipse sell = (MEllipse) s;
        Ellipse ell = new Ellipse(sell.getXOrigin(),
                sell.getYOrigin(), sell.getXHeight(), sell.getYWidth());
        ell.setFill(Color.rgb(255, 0, 0, 0.15));
        return ell;
    }
}
