package prae2;

public class VerketteListe<E> {

  private class Knoten {
    Knoten next;
    E e;

    public Knoten(Knoten next, E e) {
      this.next = next;
      this.e = e;
    }
  }

  Knoten end = new Knoten(null, null);

  Knoten anf = new Knoten(end, null);

  public void add(E e) {
    anf.next = new Knoten(anf.next, e);
  }

  private Knoten sucheVor(E e) {
    end.e = e;
    Knoten vor = anf;
    while (!e.equals(vor.next.e)) {
      vor = vor.next;
    }
    return vor;
  }

  public boolean contains(E e) {
    Knoten check = anf;
    while (check != null) {
      if (check.e == e) {
        return true;
      }
      check = check.next;
    }
    return false;
  }

  public boolean remove(E e) {
    while (anf != null) {
      if (anf.e == e) {
        if (anf.e == end){
          end = sucheVor(anf.e);
        }
        anf.e = null;
        while (anf.next != end) {
          anf = anf.next;
        }
        return true;
      }
      anf = anf.next;
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    Knoten hier = anf.next;
    while (hier != end) {
      sb.append(hier.e + ", ");
      hier = hier.next;
    }
    if (sb.length() > 2) {
      sb.delete(sb.length() - 2, sb.length());
    }
    sb.append("]");
    return sb.toString();
  }

  static public void main(String[] args) {
    VerketteListe<String> ml = new VerketteListe<String>();
    ml.add("aa");
    ml.add("bb");
    ml.add("cc");
    System.out.println(ml);
    System.out.println(ml.contains("aa"));
    System.out.println(ml);
    System.out.println(ml.contains("abc"));
    System.out.println(ml);
    System.out.println(ml.remove("bb"));
    System.out.println(ml);
  }
}


