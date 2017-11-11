package LE06.model;

import java.util.Arrays;

public class MAllShapes {

    public static MShape[] getDefaultShapes(){
        MShape[] allshapes= new MShape[7];
        allshapes[0] = new MRectangle( 255, 125, 30, 25);
        allshapes[1] = new MRectangle( 155, 75, 10, 40);
        allshapes[2] = new MCircle( 80, 80, 10);
        allshapes[3] = new MRectangle( 45, 105, 80, 40);
        allshapes[4] = new MCircle( 200, 100, 50);
        allshapes[5] = new MEllipse(10,100,100,23);
        allshapes[6] = new MSquare(100,10,70);
        return allshapes;
    }

    public static void main(String[] args) {
        MShape[] mix =  MAllShapes.getDefaultShapes();
        System.out.println(Arrays.deepToString(mix));
    }
}