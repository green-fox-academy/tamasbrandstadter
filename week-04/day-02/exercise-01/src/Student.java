public class Student extends Person {
  private String previousOrganiztaion;
  private int skippedDays;

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + " and " + this.getAge() + " year old " + this.getGender() + " from " + previousOrganiztaion + " who skipped " + skippedDays + " from the course already.");
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








}
