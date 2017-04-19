package main.java.music;

public abstract class Instrument {
  protected String name;

  abstract void play();

  public Instrument(String name) {
    this.name = name;
  }
}
