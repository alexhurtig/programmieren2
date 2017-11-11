package LE06.model;

public class MShape {

    protected double xOrigin;

    protected double yOrigin;

    public MShape(double x, double y) {
        xOrigin = x;
        yOrigin = y;
    }

    public double getXOrigin() {
        return xOrigin;
    }

    public double getYOrigin() {
        return yOrigin;
    }

    public double area() {
        return 0;
    }

    public double circumference() {
        return 0;
    }

    public String origin() {
        return ("(" + xOrigin + ", " + yOrigin + ")");
    }

    @Override
    public String toString() {
        return ("Shape with origin: " + origin());
    }
}