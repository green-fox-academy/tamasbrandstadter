public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    a +=10;
    System.out.println(a);

    int b = 100;
    b -=7;
    System.out.println(b);

    int c = 44;
    c *= 2;
    System.out.println(c);

    int d = 125;
    d /= 5;
    System.out.println(d);

    int e = 8;
    e = e * e;
    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    boolean isItBigger = f1 > f2;
    System.out.println(isItBigger);

    int h = 1357985474;
    if (h%11 > 0) {
      System.out.println("true");
    }
    else {
      System.out.println("false.");
    }

    int g1 = 350;
    int g2 = 200;
    if ((g2 *= 2) > g1) {
      System.out.println("g2 is bigger");
    }
    else {
      System.out.println("g2 is not bigger");
    }


    int i1 = 10;
    int i2 = 3;
    if ((i1 > i2*i2) && (i1 < (i2*i2*i2))) {
      System.out.println("true");
    }

    int j = 1521;
    if ((j%5 == 0) || j%3 == 0) {
      System.out.println("true");
    }

    String k = "Apple";
    k = k + k + k + k + k;
    System.out.println(k);





  }
}
