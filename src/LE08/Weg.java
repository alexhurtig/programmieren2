package LE08;

public class Weg {

    public static void main(String[] args) {
        Labyrinth labyrinth = new Labyrinth();
        char[][] lab = labyrinth.getLabyrinth();
        Labyrinth.printLab(lab);

        if (labyrinth.existWeg(5, 5)) {
            System.out.println("Weg gefunden");
        } else {
            System.out.println("Keinen Weg gefunden");
        }
        Labyrinth.printLab(lab);

        Labyrinth labyrinth2 = new Labyrinth();
        char[][] lab2 = labyrinth2.getLabyrinth2();
        Labyrinth.printLab(lab2);

        if (labyrinth2.existWeg(5, 5)) {
            System.out.println("Weg gefunden");
        } else {
            System.out.println("Keinen Weg gefunden");
        }
        Labyrinth.printLab(lab2);
    }

}
