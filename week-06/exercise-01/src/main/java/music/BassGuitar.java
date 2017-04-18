package main.java.music;

public class BassGuitar extends StringedInstrument {
  String formatPlay;

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  public BassGuitar() {
    this.formatPlay = "Duum-duum-duum";
  }


  @Override
  void play() {


  }
}
