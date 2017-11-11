package LE06.model;

public class MEllipse extends MShape{

    private double xHeigth;
    private double yWidth;

    public MEllipse(double xOrigin, double yOrigin, double xHeigth, double yWidth) {
        super(xOrigin, yOrigin);
        this.xHeigth = xHeigth;
        this.yWidth = yWidth;
    }

    public double getXHeight() {
        return xHeigth;
    }

    public double getYWidth(){
        return yWidth;
    }

    @Override
    public double area () {return (Math.PI*xHeigth*yWidth);}
}
