package LE04;

import java.util.ArrayList;

public class TelefonEintrag {
    public static ArrayList update(String von, String zu, ArrayList telefonBuch) {
        int rep = find(von, telefonBuch);

        if (rep > -1) {
            String[] neuesArray = (String[]) telefonBuch.get(rep);
            neuesArray[0] = zu;
            telefonBuch.set(rep, neuesArray);
            return telefonBuch;
        } else {
            return telefonBuch;
        }
    }

    public static ArrayList delete(String what, ArrayList liste) {
        int removable = find(what, liste);
        if (removable != -1) {
            liste.remove(removable);
            return liste;
        } else {
            return liste;
        }
    }

    public static int find(String what, ArrayList liste) {
        int x = 0;
        while (x < liste.size()) {
            String[] neuesArray = (String[]) liste.get(x);
            if (neuesArray[0] == what) {
                return x;
            }
            if (neuesArray[1] == what) {
                return x;
            }
            x++;
        }
        System.out.println(what + " konnte nicht gefunden werden.");
        return -1;
    }
}
