package LE07.model;

public class MSquare extends MShape {

    private double side;

    public MSquare(double xOrigin, double yOrigin, double side) {
        super(xOrigin, yOrigin);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setxDelta(double side) {
        this.side = side;
    }

    public void setyDelta(double side) {
        this.side = side;
    }

    public String toStringHeight() {
        return String.valueOf(this.side);
    }

    public String toStringWidth() {
        return String.valueOf(this.side);
    }

    @Override
    public double circumference() {
        return (4 * side);
    }

    @Override
    public String toString() {
        return "Square with origin: " + origin() +
                " and side: " + this.side;
    }
}
