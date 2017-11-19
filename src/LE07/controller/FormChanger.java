package LE07.controller;

import LE07.model.MAllShapes;
import LE07.model.MShape;
import LE07.view.VFormChanger;
import LE07.view.VShapes;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FormChanger implements EventHandler<ActionEvent> {

    private MShape shape;

    public void FormChanger(MShape s, String l, Stage stage) {
        this.shape = s;
        new VFormChanger().enterRatingStage(s, l, stage);
    }

    @Override
    public void handle(ActionEvent e) {
    }

    public static MShape checkValues(MShape shape, TextField xo, TextField yo, TextField h, TextField w, Label lx, Label ly, Label lh, Label lw, Label info, Stage secondStage) {
        String xori = xo.getText();
        String yori = yo.getText();
        String hei = h.getText();
        String wid = w.getText();

        try {
            double xor = Double.parseDouble(xori);
            double yor = Double.parseDouble(yori);
            double he = Double.parseDouble(hei);
            double wi = Double.parseDouble(wid);

            if (0 < xor && xor < 500 && 0 < yor && yor < 500 && 0 < he && he < 500 && 0 < wi && wi < 500) {
                shape.setxOrigin(xor);
                shape.setyOrigin(yor);
                shape.setxDelta(wi);
                shape.setyDelta(he);
                shape.setFill(Color.rgb(0, 255, 0, 0.15));
                MAllShapes.setShape(shape);
                new VShapes().startView(secondStage, MAllShapes.getAllShapes());
                return shape;

            } else {
                wrongValue(lx, ly, lh, lw, info);
            }
        } catch (NumberFormatException e) {
            wrongValue(lx, ly, lh, lw, info);
        }
        return null;
    }

    private static void wrongValue(Label x, Label y, Label h, Label w, Label i) {
        x.setTextFill(Color.RED);
        y.setTextFill(Color.RED);
        h.setTextFill(Color.RED);
        w.setTextFill(Color.RED);
        i.setText("Bitte nur Werte zwischen 0 und 500 verwenden!");
        i.setTextFill(Color.RED);
    }
}
