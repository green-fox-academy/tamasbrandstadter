import java.util.Comparator;

public class Student extends Person implements Comparator<Student> {
  private String previousOrganiztaion;
  private int skippedDays;

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + " a " + this.getAge() + " year old " + this.getGender() + " from " + previousOrganiztaion + " who skipped " + skippedDays + " from the course already.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  Student(String name, int age, String gender, String previousOrganiztaion) {
    super(name, age, gender);
    this.previousOrganiztaion = previousOrganiztaion;
    this.skippedDays = 0;
  }

  Student() {
    super();
    this.previousOrganiztaion = "The School of Life";
    this.skippedDays = 0;
  }

  private int getSkippedDays() {
    return skippedDays;
  }

  @Override
  public int compare(Student o1, Student o2) {
    if (o1.getSkippedDays() == o2.getSkippedDays()) {
      return 0;
    }
    return o1.getSkippedDays() > o2.getSkippedDays() ? -1 : 1;
  }
}
