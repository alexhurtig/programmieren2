package LE07.model;

import javafx.beans.value.ObservableDoubleValue;

public class MRectangle extends MShape {
	
	private double xDelta;
	private double yDelta;

	public MRectangle(double xOrigin, double yOrigin, double xDelta, double yDelta) {
		super(xOrigin, yOrigin);
		this.xDelta = xDelta;
		this.yDelta = yDelta;
	}

	public double getxDelta() {
		return xDelta;
	}

	public double getyDelta(){
		return yDelta;
	}

	public void setxDelta(double xDelta) {
		this.xDelta = xDelta;
	}

	public void setyDelta(double yDelta) {
		this.yDelta = yDelta;
	}

	@Override
    public double area() {
        return (xDelta) * (yDelta);
    }

	@Override
    public double circumference() {
        return (2*xDelta) + (2*yDelta);
    }

    @Override
	public String toStringHeight(){
		return String.valueOf(yDelta);
	}

	@Override
	public String toStringWidth(){
		return String.valueOf(xDelta);
	}

    @Override
    public String toString() {
    	return "Rectangle with origin: " + origin() + 
				", xDelta: " + this.xDelta + ", yDelta: " + this.yDelta;
    }

}
