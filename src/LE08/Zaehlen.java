package LE08;

import LE04.TelefonEintrag;

import java.util.ArrayList;

import static LE04.TelefonEintrag.printRegister;
import static jdk.nashorn.internal.objects.NativeArray.lastIndexOf;

public class Zaehlen {

    static int d = 0;

    public static void main(String[] args) {
        System.out.println(laenge("fdghsajfgj", 0));
        d = 0;
        System.out.println(laenge("", 0));
        d = 0;
        System.out.println(laenge("f", 0));
    }

    public static int laenge(String s, int c){
        try {
            char ca = s.charAt(c);
            d++;
            laenge(s, c+1);
        } catch (IndexOutOfBoundsException e){
            return d;
        }

        return d;
    }
}
