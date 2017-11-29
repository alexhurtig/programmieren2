package LE08;

public class Labyrinth {

    private char[][] lab;
    private boolean ret = false;
    int prevX;
    int prevY;
    int deadCount = 0;

    public boolean existWeg(int y, int x) {

        if (deadCount < 100) {
            deadCount++;
        } else return false;

        if (!ausgangGefunden(y, x)) {
            if (goWest(y, x)) {
                x--;
                existWeg(y, x);
            } else if (goNorth(y, x)) {
                y--;
                existWeg(y, x);
            } else if (goEast(y, x)) {
                x++;
                existWeg(y, x);
            } else if (goSouth(y, x)) {
                y++;
                existWeg(y, x);
            } else if (goForTheStarsWest(y, x)) {
                x--;
                existWeg(y, x);
            } else if (goForTheStarsNorth(y, x)) {
                y--;
                existWeg(y, x);
            } else if (goForTheStarsEast(y, x)) {
                x++;
                existWeg(y, x);
            } else if (goForTheStarsSouth(y, x)) {
                y++;
                existWeg(y, x);
            }
        } else {
            lab[y][x] = '*';
            ret = true;
        }
        return ret;
    }

    public boolean goWest(int y, int x) {
        if ((lab[y][x - 1]) == 'X') {
            return false;
        } else if ((lab[y][x - 1]) == ' ') {
            lab[y][x - 1] = '*';
            prevY = y;
            prevX = x;
            return true;
        } else return false;
    }

    public boolean goNorth(int y, int x) {
        if (lab[y - 1][x] == 'X') {
            return false;
        } else if (lab[y - 1][x] == ' ') {
            lab[y - 1][x] = '*';
            prevY = y;
            prevX = x;
            return true;
        } else return false;
    }

    public boolean goEast(int y, int x) {
        if (lab[y][x + 1] == 'X') {
            return false;
        } else if (lab[y][x + 1] == ' ') {
            lab[y][x + 1] = '*';
            prevY = y;
            prevX = x;
            return true;
        } else return false;
    }

    public boolean goSouth(int y, int x) {
        if (lab[y + 1][x] == 'X') {
            return false;
        } else if (lab[y + 1][x] == ' ') {
            lab[y + 1][x] = '*';
            prevY = y;
            prevX = x;
            return true;
        } else return false;
    }

    public boolean goForTheStarsWest(int y, int x) {
        if ((lab[y][x - 1]) == '*') {
            if ((y) == prevY && (x - 1) == prevX) {
                return false;
            } else {
                prevY = y;
                prevX = x;
                return true;
            }
        } else return false;
    }

    public boolean goForTheStarsNorth(int y, int x) {
        if ((lab[y - 1][x]) == '*') {
            if ((y - 1) == prevY && (x) == prevX) {
                return false;
            } else {
                prevY = y;
                prevX = x;
                return true;
            }
        } else return false;
    }

    public boolean goForTheStarsEast(int y, int x) {
        if ((lab[y][x + 1]) == '*') {
            if ((y) == prevY && (x + 1) == prevX) {
                return false;
            } else {
                prevY = y;
                prevX = x;
                return true;
            }
        } else return false;
    }

    public boolean goForTheStarsSouth(int y, int x) {
        if ((lab[y + 1][x]) == '*') {
            if ((y + 1) == prevY && (x) == prevX) {
                return false;
            } else {
                prevY = y;
                prevX = x;
                return true;
            }
        } else return false;
    }

    private static boolean ausgangGefunden(int y, int x) {

        if ((x >= 9) || (x <= 0) || (y >= 9) || (y <= 0)) {
            return true;
        }
        return false;
    }

    static void printLab(char[][] lab) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(lab[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }

    public char[][] getLabyrinth() {
        lab = new char[10][10];

        lab[0][0] = 'X';
        lab[1][0] = ' ';
        lab[2][0] = 'X';
        lab[3][0] = 'X';
        lab[4][0] = 'X';
        lab[5][0] = 'X';
        lab[6][0] = 'X';
        lab[7][0] = 'X';
        lab[8][0] = ' ';
        lab[9][0] = ' ';

        lab[0][1] = ' ';
        lab[1][1] = ' ';
        lab[2][1] = 'X';
        lab[3][1] = ' ';
        lab[4][1] = ' ';
        lab[5][1] = ' ';
        lab[6][1] = 'X';
        lab[7][1] = 'X';
        lab[8][1] = ' ';
        lab[9][1] = ' ';

        lab[0][2] = 'X';
        lab[1][2] = ' ';
        lab[2][2] = 'X';
        lab[3][2] = ' ';
        lab[4][2] = 'X';
        lab[5][2] = ' ';
        lab[6][2] = 'X';
        lab[7][2] = 'X';
        lab[8][2] = ' ';
        lab[9][2] = 'X';

        lab[0][3] = ' ';
        lab[1][3] = ' ';
        lab[2][3] = 'X';
        lab[3][3] = ' ';
        lab[4][3] = ' ';
        lab[5][3] = ' ';
        lab[6][3] = 'X';
        lab[7][3] = 'X';
        lab[8][3] = ' ';
        lab[9][3] = ' ';

        lab[0][4] = 'X';
        lab[1][4] = ' ';
        lab[2][4] = 'X';
        lab[3][4] = ' ';
        lab[4][4] = ' ';
        lab[5][4] = 'X';
        lab[6][4] = 'X';
        lab[7][4] = 'X';
        lab[8][4] = ' ';
        lab[9][4] = 'X';

        lab[0][5] = ' ';
        lab[1][5] = ' ';
        lab[2][5] = 'X';
        lab[3][5] = ' ';
        lab[4][5] = ' ';
        lab[5][5] = ' ';
        lab[6][5] = 'X';
        lab[7][5] = 'X';
        lab[8][5] = ' ';
        lab[9][5] = ' ';

        lab[0][6] = 'X';
        lab[1][6] = 'X';
        lab[2][6] = ' ';
        lab[3][6] = ' ';
        lab[4][6] = ' ';
        lab[5][6] = ' ';
        lab[6][6] = 'X';
        lab[7][6] = 'X';
        lab[8][6] = ' ';
        lab[9][6] = 'X';

        lab[0][7] = 'X';
        lab[1][7] = ' ';
        lab[2][7] = ' ';
        lab[3][7] = ' ';
        lab[4][7] = ' ';
        lab[5][7] = ' ';
        lab[6][7] = 'X';
        lab[7][7] = 'X';
        lab[8][7] = ' ';
        lab[9][7] = 'X';

        lab[0][8] = 'X';
        lab[1][8] = ' ';
        lab[2][8] = 'X';
        lab[3][8] = ' ';
        lab[4][8] = ' ';
        lab[5][8] = ' ';
        lab[6][8] = 'X';
        lab[7][8] = 'X';
        lab[8][8] = ' ';
        lab[9][8] = 'X';

        lab[0][9] = ' ';
        lab[1][9] = ' ';
        lab[2][9] = 'X';
        lab[3][9] = ' ';
        lab[4][9] = ' ';
        lab[5][9] = ' ';
        lab[6][9] = 'X';
        lab[7][9] = 'X';
        lab[8][9] = ' ';
        lab[9][9] = ' ';

        return lab;
    }

    public char[][] getLabyrinth2() {
        lab = new char[10][10];

        lab[0][0] = 'X';
        lab[1][0] = 'X';
        lab[2][0] = 'X';
        lab[3][0] = 'X';
        lab[4][0] = 'X';
        lab[5][0] = 'X';
        lab[6][0] = 'X';
        lab[7][0] = 'X';
        lab[8][0] = 'X';
        lab[9][0] = 'X';

        lab[0][1] = 'X';
        lab[1][1] = ' ';
        lab[2][1] = 'X';
        lab[3][1] = ' ';
        lab[4][1] = ' ';
        lab[5][1] = ' ';
        lab[6][1] = ' ';
        lab[7][1] = ' ';
        lab[8][1] = ' ';
        lab[9][1] = ' ';

        lab[0][2] = 'X';
        lab[1][2] = ' ';
        lab[2][2] = 'X';
        lab[3][2] = ' ';
        lab[4][2] = 'X';
        lab[5][2] = ' ';
        lab[6][2] = ' ';
        lab[7][2] = 'X';
        lab[8][2] = ' ';
        lab[9][2] = 'X';

        lab[0][3] = ' ';
        lab[1][3] = ' ';
        lab[2][3] = ' ';
        lab[3][3] = ' ';
        lab[4][3] = ' ';
        lab[5][3] = ' ';
        lab[6][3] = ' ';
        lab[7][3] = ' ';
        lab[8][3] = ' ';
        lab[9][3] = ' ';

        lab[0][4] = 'X';
        lab[1][4] = ' ';
        lab[2][4] = 'X';
        lab[3][4] = ' ';
        lab[4][4] = ' ';
        lab[5][4] = 'X';
        lab[6][4] = 'X';
        lab[7][4] = ' ';
        lab[8][4] = ' ';
        lab[9][4] = 'X';

        lab[0][5] = ' ';
        lab[1][5] = ' ';
        lab[2][5] = 'X';
        lab[3][5] = ' ';
        lab[4][5] = ' ';
        lab[5][5] = ' ';
        lab[6][5] = 'X';
        lab[7][5] = ' ';
        lab[8][5] = ' ';
        lab[9][5] = ' ';

        lab[0][6] = 'X';
        lab[1][6] = 'X';
        lab[2][6] = ' ';
        lab[3][6] = ' ';
        lab[4][6] = ' ';
        lab[5][6] = ' ';
        lab[6][6] = 'X';
        lab[7][6] = ' ';
        lab[8][6] = ' ';
        lab[9][6] = 'X';

        lab[0][7] = 'X';
        lab[1][7] = ' ';
        lab[2][7] = ' ';
        lab[3][7] = ' ';
        lab[4][7] = ' ';
        lab[5][7] = ' ';
        lab[6][7] = 'X';
        lab[7][7] = ' ';
        lab[8][7] = ' ';
        lab[9][7] = 'X';

        lab[0][8] = 'X';
        lab[1][8] = ' ';
        lab[2][8] = 'X';
        lab[3][8] = ' ';
        lab[4][8] = ' ';
        lab[5][8] = ' ';
        lab[6][8] = 'X';
        lab[7][8] = ' ';
        lab[8][8] = ' ';
        lab[9][8] = 'X';

        lab[0][9] = ' ';
        lab[1][9] = ' ';
        lab[2][9] = 'X';
        lab[3][9] = ' ';
        lab[4][9] = ' ';
        lab[5][9] = ' ';
        lab[6][9] = 'X';
        lab[7][9] = ' ';
        lab[8][9] = ' ';
        lab[9][9] = ' ';

        return lab;
    }
}