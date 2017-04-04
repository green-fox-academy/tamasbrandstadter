public class Mentor extends Person {
  private int level;

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + " and " + this.getAge() + " year old " + this.getGender() + " " + level + "mentor.");
  }

}
