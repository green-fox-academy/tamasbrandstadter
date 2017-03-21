/**
 * Created by dr. Brandstädter Tamás on 2017.03.21..
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int elapsedSeconds = 14 * 3600 + 34 * 60 + 42;
    int totalSeconds = 24 * 60 * 60;
    int remainingSeconds = totalSeconds - elapsedSeconds;
    System.out.println("Remaining seconds from the day: " + remainingSeconds);
  }
}
