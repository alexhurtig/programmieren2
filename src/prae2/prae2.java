package prae2;

public class prae2 {

  public static void main(String[] args) {

    //reku06(432);

    System.out.println(fibonacciR(6));
    //1,2,3,5,8,13,21,34,55,89,144,233,377

  }

  static int pos1 = 0;
  static int pos2 = 1;
  static int fibo = 0;

  private static int fibonacciR(int i) {
    if (i == 0) {
      return fibo;
    } else {
      fibo = pos1 + pos2;
      pos1 = pos2;
      pos2 = fibo;
      fibonacciR(--i);
    }
    return fibo;
  }

  static public void reku06(final int N) {
    System.out.println(N % 10);
    if ((N / 10) == 0) {
      return;
    } else {
      reku06(N / 10);
    }
  }
}