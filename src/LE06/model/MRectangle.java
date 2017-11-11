package LE06.model;

public class MRectangle extends MShape {
	
	private double xDelta;
	private double yDelta;

	public MRectangle(double xOrigin, double yOrigin, double xDelta, double yDelta) {
		super(xOrigin, yOrigin);
		this.xDelta = xDelta;
		this.yDelta = yDelta;
	}

	public double getXDelta() {
		return xDelta;
	}

	public double getYDelta(){
		return yDelta;
	}

	@Override
    public double area() {
        return (2*this.xDelta) * (2*this.yDelta);
    }

	@Override
    public double circumference() {
        return (4*this.xDelta) + (4*this.yDelta);
    }

    @Override
    public String toString() {
    	return "Rectangle with origin: " + origin() + 
				", xDelta: " + this.xDelta + ", yDelta: ";
    }

}
