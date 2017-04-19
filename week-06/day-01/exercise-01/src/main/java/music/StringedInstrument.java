package main.java.music;

public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  final String formatForPlay ="%s, a %d-stringed instrument that %s\n";



  public StringedInstrument(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  public String getFormatForPlay() {
    return formatForPlay;
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }
}
