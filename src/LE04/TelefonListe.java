package LE04;

import java.util.ArrayList;

import static LE04.TelefonEintrag.delete;
import static LE04.TelefonEintrag.find;
import static LE04.TelefonEintrag.update;

public class TelefonListe {

    public static void main(String[] args) {
        ArrayList<String> telefonBuch = new ArrayList<String>();

        telefonBuch = create("erster", "1234", telefonBuch);

        telefonBuch = create("zweiter", "12345", telefonBuch);

        telefonBuch = create("vierter", "12346", telefonBuch);

        read(telefonBuch);

        telefonBuch = update("zweiter", "dritter", telefonBuch);

        read(telefonBuch);

        telefonBuch = delete("dritter", telefonBuch);

        telefonBuch = delete("erst", telefonBuch);

        read(telefonBuch);

        find("bla", telefonBuch);

        read(find("vierter",telefonBuch),telefonBuch);
    }

    public static ArrayList create(String name, String number, ArrayList liste) {
        String[] arr = new String[]{name, number};
        liste.add(arr);
        return liste;
    }

    public static void read(ArrayList liste) {
        int x = 0;
        while (x < liste.size()) {
            String[] neuesArray = (String[]) liste.get(x);
            System.out.print(neuesArray[0]);
            System.out.println(neuesArray[1]);
            x++;
        }
    }

    public static void read(int einer, ArrayList liste) {
        String[] neuesArray = (String[]) liste.get(einer);
        System.out.print(neuesArray[0]);
        System.out.println(neuesArray[1]);
    }
}
