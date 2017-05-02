import java.util.Comparator;

public class Mentor extends Person implements Comparator<Mentor> {
  private String level;

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + " a " + this.getAge() + " year old " + this.getGender() + " " + level + " mentor.");
  }

  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  Mentor() {
    super();
    this.level = "intermediate";
  }

  private String getLevel() {
    return level;
  }

  @Override
  public int compare(Mentor o1, Mentor o2) {
    if (o1.getLevel().equals(o2.getLevel())) {
      return 0;
    }
    if (o1.getLevel().equals("hardcore") || o1.getLevel().equals("intermediate") && o2.getLevel().equals("basic")) {
      return 1;
    } else {
      return -1;
    }
  }
}