public class ConditionalVariableMutation {
  public static void main(String[] args) {
    double a = 24;
    int out = 0;
    if (a%2 == 0) {
      out++;
    }
    System.out.println(out);


    int b = 13;
    String out2 = "";

    if (b > 10 && b < 20) {
      out2 = "Sweet!";
    }
    if (b < 10) {
      out2 = "More!";
    }
    if (b > 20) {
      out2 = "Less!";
    }
    System.out.println(out2);



    int c = 123;
    int credits = 100;
    boolean isBonus = false;

    if (credits >= 50 && (isBonus == false)) {
      c -= 2;
    }
    else if (credits < 50 && (isBonus == false)) {
      c--;
    }
    else if (!isBonus) {
      c = c;
    }
    System.out.println(c);

    int d = 8;
    int time = 120;
    String out3 = "";

    if (d%4 == 0 && time<=200) {
      out3 = "Check";
    }
    if (time > 200) {
      out3 = "Time out.";
    }
    if (d%4 > 0) {
      out3 = "Run Forest run!";
    }

    System.out.println(out3);





  }
}