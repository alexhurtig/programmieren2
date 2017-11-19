package LE07.view;

import LE07.model.MEllipse;
import LE07.model.MShape;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class VEllipse {

    public static Ellipse getShape(MShape s) {
        MEllipse sell = (MEllipse) s;
        Ellipse ell = new Ellipse(sell.getxOrigin(),
                sell.getyOrigin(), sell.getXDelta(), sell.getYDelta());
        ell.setFill(Color.rgb(255, 0, 0, 0.15));
        return ell;
    }
}
