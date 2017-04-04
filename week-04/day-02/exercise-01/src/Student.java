public class Student extends Person {
  private String previousOrganiztaion;
  private int skippedDays;

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + name + " and " + age + " year old " + gender + " from " + previousOrganiztaion + "who skipped" + skippedDays + "from the course already.");
  }

  public int skipDays(int numberOfDays) {
    this.skippedDays = skippedDays + numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganiztaion) {
    this.skippedDays = 0;
  }

  public Student() {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }








}
