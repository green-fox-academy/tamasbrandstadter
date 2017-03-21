/**
 * Created by dr. Brandstädter Tamás on 2017.03.21..
 */
public class CodingHours {
  public static void main(String[] args) {
    int dailyActivity = 6;
    int workdays = 5;
    int weeks = 17;
    int semesterFullCodingHours = weeks * workdays * dailyActivity;

    System.out.println("Attendee's hours spent coding in semester: " + (semesterFullCodingHours));

    int workHoursWeekly = 52;
    System.out.println("Percentage of coding hours in the semester: " + (weeks * workHoursWeekly / 100));
  }
}
