package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  String formatPlay;

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public ElectricGuitar(){
    this.numberOfStrings = numberOfStrings;
    this.formatPlay = "twangs";

  }

  @Override
  void play() {
    System.out.printf();


  }
}
