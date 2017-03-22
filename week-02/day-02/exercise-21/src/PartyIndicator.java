import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int girls = scanner.nextInt();
    int boys = scanner.nextInt();

    if (girls == boys && (girls+boys > 20) && (girls !=0)) {
      System.out.println("The party is excellent.");
    }
    if ((girls < boys && (girls+boys > 20) && (girls !=0))){
      System.out.println("Quite cool party.");
    }
    if (boys+girls < 20 && girls!=0) {
      System.out.println("Avarage party.");
    }
    else if (girls == 0) {
      System.out.println("Sausage party.");
    }



  }
}