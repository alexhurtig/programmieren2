package LE07.model;

import javafx.beans.value.ObservableDoubleValue;

public class MEllipse extends MShape {

    private double xDelta;
    private double yDelta;

    public MEllipse(double xOrigin, double yOrigin, double xDelta, double yDelta) {
        super(xOrigin, yOrigin);
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public double getXDelta() {
        return this.xDelta;
    }

    public double getYDelta(){
        return this.yDelta;
    }

    public void setxDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(double yDelta) {
        this.yDelta = yDelta;
    }

    public String toStringHeight(){
        return String.valueOf(xDelta);
    }

    public String toStringWidth(){
        return (String.valueOf(yDelta));
    }

    @Override
    public double area () {return (Math.PI*xDelta*yDelta);}

    @Override
    public String toString() {
        return "Rectangle with origin: " + origin() +
                ", xDelta: " + this.xDelta + ", yDelta: " + this.yDelta;
    }
}
