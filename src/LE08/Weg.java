package LE08;

public class Weg {

    public static void main(String[] args) {
        Labyrinth labyrinth = new Labyrinth();
        labyrinth.getLabyrinth();
        labyrinth.printLab();

        if (labyrinth.existWeg(5, 5)) {
            System.out.println("Weg gefunden");
        } else {
            System.out.println("Keinen Weg gefunden");
        }
        labyrinth.printLab();

        labyrinth.getLabyrinth2();
        labyrinth.printLab();

        if (labyrinth.existWeg(5, 5)) {
            System.out.println("Weg gefunden");
        } else {
            System.out.println("Keinen Weg gefunden");
        }
        labyrinth.printLab();
    }

}
