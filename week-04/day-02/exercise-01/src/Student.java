public class Student extends Person {
  private String previousOrganiztaion;
  private int skippedDays;

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + super.name + " and " + super.age + " year old " + super.gender + " from " + previousOrganiztaion + "who skipped" + skippedDays + "from the course already.");
  }

  public int skipDays(int numberOfDays) {
    
  }








}
