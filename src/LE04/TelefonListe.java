package LE04;

import java.util.ArrayList;

import static LE04.TelefonEintrag.printRegister;

public class TelefonListe {

    public static void main(String[] args) {
        ArrayList<TelefonEintrag> telefonbuch = TelefonEintrag.newRegister();

        telefonbuch.add(new TelefonEintrag("erster", "1234"));
        telefonbuch.add(new TelefonEintrag("zweiter", "12345"));
        telefonbuch.add(new TelefonEintrag("vierter", "123456"));
        printRegister(telefonbuch);
        System.out.println(TelefonEintrag.find(telefonbuch, "bla"));
        TelefonEintrag.update("zweiter", "dritter", telefonbuch);
        TelefonEintrag.printRegister(telefonbuch);
        System.out.println(TelefonEintrag.find(telefonbuch, "vierter"));
        TelefonEintrag.delete("dritter", telefonbuch);
        printRegister(telefonbuch);
        TelefonEintrag.delete("erst", telefonbuch);
        System.out.println(TelefonEintrag.find(telefonbuch, "1234"));
    }
}
