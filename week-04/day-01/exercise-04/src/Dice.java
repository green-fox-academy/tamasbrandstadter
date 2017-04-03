public class Dice {
  int[] dices = new int[6];








  //    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6


  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
    Dice myDice = new Dice();

    myDice.roll();
    while (myDice.getCurrent(0) + myDice.getCurrent(1) + myDice.getCurrent(2) + myDice.getCurrent(3) + myDice.getCurrent(4) + myDice.getCurrent(5) != 36) {
      myDice.reroll();
    }
    System.out.println(myDice.getCurrent(0));
    System.out.println(myDice.getCurrent(1));
    System.out.println(myDice.getCurrent(2));
    System.out.println(myDice.getCurrent(3));
    System.out.println(myDice.getCurrent(4));
    System.out.println(myDice.getCurrent(5));
  }
}