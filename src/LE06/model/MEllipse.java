package LE06.model;

public class MEllipse extends MShape{

    private double xHeigth;
    private double yWidth;

    public MEllipse(double xOrigin, double yOrigin, double xHeight, double yWidth) {
        super(xOrigin, yOrigin);
        this.xHeigth = xHeight;
        this.yWidth = yWidth;
    }

    public double getXHeight() {
        return xHeigth;
    }

    public double getYWidth(){
        return yWidth;
    }
}
