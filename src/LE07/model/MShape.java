package LE07.model;

import javafx.scene.paint.Color;

public class MShape {

    private double xOrigin;
    private double yOrigin;
    private double xDelta;
    private double yDelta;
    private Color fill;

    public MShape(double xOrigin, double yOrigin) {
        this.xOrigin = xOrigin;
        this.yOrigin = yOrigin;
    }

    public double getxOrigin() {
        return xOrigin;
    }

    public double getyOrigin() {
        return yOrigin;
    }

    public void setxOrigin(double xOrigin) {
        this.xOrigin = xOrigin;
    }

    public void setyOrigin(double yOrigin) {
        this.yOrigin = yOrigin;
    }

    public double getxDelta() {
        return xDelta;
    }

    public double getyDelta() {
        return yDelta;
    }

    public void setxDelta(double x) {
        this.xDelta = x;
    }

    public void setyDelta(double y) {
        this.yDelta = y;
    }

    public double area() {
        return 0;
    }

    public double circumference() {
        return 0;
    }

    public String toStringXOrigin() {
        return String.valueOf(xOrigin);
    }

    public String toStringYOrigin() {
        return String.valueOf(yOrigin);
    }

    public String toStringHeight() {
        return "";
    }

    public String toStringWidth() {
        return "";
    }


    public String origin() {
        return ("(" + xOrigin + ", " + yOrigin + ")");
    }

    @Override
    public String toString() {
        return ("Shape with origin: " + origin());
    }

    public void setFill(Color fill) {
        this.fill = fill;
    }
}