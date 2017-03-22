import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();

    for (int i=0; i < userInput; i++) {
      for (int k=0; k < userInput-1-i; k++) {
        System.out.print(" ");
      }
      for (int j=0; j < i*2+1; j++){
        System.out.print("*");
      }
      System.out.println("");
    }
      


  }
}