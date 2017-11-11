package LE06.model;

public class MSquare extends MShape{

    private double side;

    public MSquare(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    public double getSide(){
        return side;
    }


}
