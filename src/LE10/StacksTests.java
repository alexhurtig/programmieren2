package LE10;

public class StacksTests {

  //Schreiben Sie eine Klasse namens StacksTests.java, welche die die Klassen Stack<E>, ArrayStack<E>, ListStack<E> und die Klasse java.util.Stack<E>
  // ausprobiert. Erzeugen Sie dabei verschieden Objekte mit mindestens zwei verschiedenen Werten für den generischen Parameter: String und ein
  // Parameter Ihrer Wahl.

  public static void main(String[] args) {

    Stack<String> as = new ArrayStack<>(5);

    try {
      System.out.println(as);

      as.push("dhgfjkasl");
      as.push("ghasdfjkl");
      as.push("tqireq");
      as.push("hjvlfab");
      as.push("dfa");

      System.out.println(as);

      System.out.println("as.pop " + as.pop());
      System.out.println("as.pop " + as.pop());
      System.out.println("as.pop " + as.pop());

      System.out.println(as);

      as.push("hjvlfab");
      as.push("dfa");
      as.push("fdasfa");

      System.out.println(as);

      as.push("req");

    } catch (FullStackException | EmptyStackException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("----------------------------------------------------------");

    Stack<Integer> as2 = new ArrayStack<>(5);

    try {
      System.out.println(as);

      as2.push(123);
      as2.push(234);
      as2.push(345);
      as2.push(456);
      as2.push(567);

      System.out.println(as2);

      System.out.println("as2.pop " + as2.pop());
      System.out.println("as2.pop " + as2.pop());
      System.out.println("as2.pop " + as2.pop());

      System.out.println(as2);

      as2.push(567);
      as2.push(789);
      as2.push(678);

      System.out.println(as2);

      as2.push(890);

    } catch (FullStackException | EmptyStackException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("----------------------------------------------------------");

    Stack<String> ls = new ListStack<>();

    try {
      System.out.println(ls);

      ls.push("asdfd");
      ls.push("fgsdhja");
      ls.push("hgfd");
      ls.push("gfsf");
      ls.push("lkhklh");

      System.out.println(ls);

      System.out.println("ls.pop " + ls.pop());
      System.out.println("ls.pop " + ls.pop());
      System.out.println("ls.pop " + ls.pop());

      System.out.println(ls);

      ls.push("tretwe");
      ls.push("bvcxb");
      ls.push("gfhtd");

      System.out.println(ls);

      ls.push("nhdz");

    } catch (FullStackException | EmptyStackException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("----------------------------------------------------------");

    Stack<Integer> ls2 = new ListStack<>();

    try {
      System.out.println(ls2);

      ls2.push(123);
      ls2.push(234);
      ls2.push(345);
      ls2.push(654);
      ls2.push(765);

      System.out.println(ls2);

      System.out.println("ls2.pop " + ls2.pop());
      System.out.println("ls2.pop " + ls2.pop());
      System.out.println("ls2.pop " + ls2.pop());

      System.out.println(ls2);

      ls2.push(876);
      ls2.push(987);
      ls2.push(998);

      System.out.println(ls2);

      ls2.push(150);

    } catch (FullStackException | EmptyStackException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("----------------------------------------------------------");

    java.util.Stack<String> si1 = new java.util.Stack<>();

    try {
      System.out.println(si1);

      si1.push("asdfd");
      si1.push("fgsdhja");
      si1.push("hgfd");
      si1.push("gfsf");
      si1.push("lkhklh");

      System.out.println(si1);

      System.out.println("si1.pop " + si1.pop());
      System.out.println("si1.pop " + si1.pop());
      System.out.println("si1.pop " + si1.pop());

      System.out.println(si1);

      si1.push("tretwe");
      si1.push("bvcxb");
      si1.push("gfhtd");

      System.out.println(si1);

      si1.push("nhdz");

    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println("----------------------------------------------------------");

    java.util.Stack<Integer> si2 = new java.util.Stack<>();

    try {
      System.out.println(si2);

      si2.push(123);
      si2.push(234);
      si2.push(345);
      si2.push(654);
      si2.push(765);

      System.out.println(si2);

      System.out.println("si2.pop " + si2.pop());
      System.out.println("si2.pop " + si2.pop());
      System.out.println("si2.pop " + si2.pop());

      System.out.println(si2);

      si2.push(876);
      si2.push(987);
      si2.push(998);

      System.out.println(si2);

      si2.push(150);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}