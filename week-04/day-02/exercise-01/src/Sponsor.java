public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + " and " + this.getAge() + " year old " + this.getGender() + " who represents " + company + " and hired " + hiredStudents + " so far.");
  }

  public void hire(int hiredStudents) {
    this.hiredStudents += hiredStudents;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

//  Sponsor(String name, int age, String gender, String company) {
//    super(name, age, gender);
//    this.company = company;
//    this.hiredStudents = 0;
//  }

  Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }


}
