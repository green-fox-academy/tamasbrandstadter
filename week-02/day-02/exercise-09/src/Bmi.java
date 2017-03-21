/**
 * Created by dr. Brandstädter Tamás on 2017.03.21..
 */
public class Bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;
    double bmi = massInKg / heightInM;
    System.out.println("BMI is: " + bmi);
    if (bmi > 40) {
      System.out.println("You need to go on a diet...");
    }
  }
}
