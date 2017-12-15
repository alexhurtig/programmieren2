package LE10;

import java.util.ArrayList;
import java.util.List;

public class StacksTests {

    //Schreiben Sie eine Klasse namens StacksTests.java, welche die die Klassen Stack<E>, ArrayStack<E>, ListStack<E> und die Klasse java.util.Stack<E>
    // ausprobiert. Erzeugen Sie dabei verschieden Objekte mit mindestens zwei verschiedenen Werten für den generischen Parameter: String und ein
    // Parameter Ihrer Wahl.

    public static void main(String[] args) {

        Stack<ArrayList[]> as = new ArrayStack<>(5);

        ArrayList[] insert = new ArrayList[1];

        ArrayList<String> als = new ArrayList<>();

        try {
            System.out.println(as);
            insert[0] = als;
            als.add("dhgfjkasl");
            as.push(insert);
            as.push(insert);
            as.push(insert);
            as.push(insert);
            as.push(insert);

            System.out.println(as);

            System.out.println("as.pop " + as.pop());
            System.out.println("as.pop " + as.pop());
            System.out.println("as.pop " + as.pop());
            System.out.println(as);


            as.push(insert);
            as.push(insert);
            as.push(insert);
            System.out.println(as);

            as.push(insert);
        } catch (FullStackException | EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------------------------");

        Stack<ArrayList[]> as2 = new ArrayStack<>(5);
        ArrayList<Integer> ali = new ArrayList<>();

        try {
            System.out.println(as);
            insert[0] = ali;
            ali.add(123);
            as2.push(insert);
            as2.push(insert);
            as2.push(insert);
            as2.push(insert);
            as2.push(insert);

            System.out.println(as2);

            System.out.println("as2.pop " + as2.pop());
            System.out.println("as2.pop " + as2.pop());
            System.out.println("as2.pop " + as2.pop());
            System.out.println(as2);


            as2.push(insert);
            as2.push(insert);
            as2.push(insert);
            System.out.println(as2);

            as2.push(insert);
        } catch (FullStackException | EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------------------------");

        Stack<List[]> ls = new ListStack<>();

        List[] l1 = new List[5];
        List[] l2 = new List[5];
        List[] l3 = new List[5];

        List<String> ls1 = new ArrayList<>(2);
        l1[0] = ls1;
        l2[0] = ls1;
        l3[0] = ls1;

        try {
            System.out.println(ls);
            ls.push(l1);
            ls.push(l1);
            ls.push(l2);
            ls.push(l3);
            ls.push(l3);

            System.out.println(ls);

            System.out.println("ls.pop " + ls.pop());
            System.out.println("ls.pop " + ls.pop());
            System.out.println("ls.pop " + ls.pop());
            System.out.println(ls);


            ls.push(l3);
            ls.push(l2);
            ls.push(l1);
            System.out.println(ls);

            ls.push(l2);

        } catch (FullStackException | EmptyStackException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------------------------");

        Stack<List[]> ls2 = new ListStack<>();

        List[] li1 = new List[5];
        List[] li2 = new List[5];
        List[] li3 = new List[5];

        List<Integer> liI1 = new ArrayList<>(2);

        l1[0] = liI1;
        l2[0] = liI1;
        l3[0] = liI1;

        try {
            System.out.println(ls2);
            ls2.push(li1);
            ls2.push(li1);
            ls2.push(li2);
            ls2.push(li3);
            ls2.push(li3);

            System.out.println(ls2);

            System.out.println("ls2.pop " + ls2.pop());
            System.out.println("ls2.pop " + ls2.pop());
            System.out.println("ls2.pop " + ls2.pop());
            System.out.println(ls2);


            ls2.push(li3);
            ls2.push(li2);
            ls2.push(li1);
            System.out.println(ls2);

            ls2.push(li2);

        } catch (FullStackException | EmptyStackException e) {
            System.out.println(e.getMessage());
        }
    }
}