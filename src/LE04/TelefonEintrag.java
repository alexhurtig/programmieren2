package LE04;

import java.util.ArrayList;

public class TelefonEintrag {

    private String name;
    private String number;

    TelefonEintrag(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public TelefonEintrag() {
    }

    public static ArrayList<TelefonEintrag> newRegister() {
        return new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static void printRegister(ArrayList<TelefonEintrag> telefonRegister) {
        for (TelefonEintrag TelefonRegister : telefonRegister) {
            if (TelefonRegister != null) {
                System.out.print("Name: " + TelefonRegister.getName());
                System.out.println(" Nummer: " + TelefonRegister.getNumber());
            }
        }
        System.out.println();
    }

    public static TelefonEintrag find(ArrayList<TelefonEintrag> telefonRegister, String search) {
        for (TelefonEintrag TelefonRegister : telefonRegister) {
            if (TelefonRegister != null) {
                if (TelefonRegister.getName().equals(search)) {
                    return TelefonRegister;
                } else if (TelefonRegister.getNumber().equals(search)) {
                    return TelefonRegister;
                }
            }
        }
        return null;
    }

    public static boolean update(String von, String zu, ArrayList<TelefonEintrag> telefonBuch) {
        TelefonEintrag rep = find(telefonBuch, von);
        if (rep != null) {
            for (TelefonEintrag telefonEintrag : telefonBuch) {
                if (telefonEintrag.getName().equals(von)) {
                    telefonEintrag.setName(zu);
                    return true;
                } else if (telefonEintrag.getNumber().equals(von)) {
                    telefonEintrag.setNumber(zu);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean delete(String weg, ArrayList<TelefonEintrag> telefonBuch) {
        TelefonEintrag rep = find(telefonBuch, weg);
        if (rep != null) {
            int c = telefonBuch.indexOf(rep);
            while (c < (telefonBuch.size() - 1)) {
                telefonBuch.set(c, telefonBuch.get(c + 1));
                telefonBuch.set(c + 1, null);
                c++;
            }
        }

        return false;
    }
}
