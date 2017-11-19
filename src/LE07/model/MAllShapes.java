package LE07.model;

public class MAllShapes {

    private static MShape[] allshapes;

    public static MShape[] getDefaultShapes() {
        allshapes = new MShape[7];
        allshapes[0] = new MRectangle(255, 125, 30, 25);
        allshapes[1] = new MRectangle(155, 75, 10, 40);
        allshapes[2] = new MCircle(80, 80, 10);
        allshapes[3] = new MRectangle(45, 105, 80, 40);
        allshapes[4] = new MCircle(200, 100, 50);
        allshapes[5] = new MEllipse(10, 100, 100, 23);
        allshapes[6] = new MSquare(100, 10, 70);
        return allshapes;
    }

    public static MShape[] getAllShapes() {
        return allshapes;
    }

    public static void setShape(MShape shape){
        for (int c = 0; c<allshapes.length; c++ ){
            if (allshapes[c] == shape){
                allshapes[c] = shape;
            }
        }
    }
}