package LE07.model;

public class MCircle extends MShape {

    private double radius;

    public MCircle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setyDelta(double radius) {
        this.radius = radius/2;
    }

    public String toStringHeight(){
        return String.valueOf(radius*2);
    }

    public String toStringWidth(){
        return String.valueOf(radius*2);
    }

    @Override
    public double area() {
        return (Math.PI * (this.radius * this.radius));
    }

    @Override
    public double circumference() {
        return (2 * Math.PI * this.radius);
    }

    @Override
    public String toString() {
        return "Circle with origin: " + origin() +
                " and radius: " + this.radius;
    }
}
