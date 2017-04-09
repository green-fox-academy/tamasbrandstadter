import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in the expression:");
    String input = scanner.nextLine();
    double input2 = scanner.nextInt();
    double input3 = scanner.nextInt();
    calculator(input, input2, input3);
  }

  public static void calculator(String input, double input2, double input3) {
    ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList("+", "-", "*", "/", "%"));
    if (myArrayList.get(0).equals(input)) {
      System.out.println(input2 + input3);
    }
    if (myArrayList.get(1).equals(input)) {
      System.out.println(input2 - input3);
    }
    if (myArrayList.get(2).equals(input)) {
      System.out.println(input2 * input3);
    }
    if (myArrayList.get(3).equals(input)) {
      System.out.println(input2 / input3);
    }
    if (myArrayList.get(4).equals(input)) {
      System.out.println(input2 % input3);
    }
    if (!myArrayList.contains(input)) {
      System.out.println("Unsupported operator.");
    }
  }
}