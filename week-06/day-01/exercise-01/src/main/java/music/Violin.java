package main.java.music;

public class Violin extends StringedInstrument {
    private String formatElectricGuitarForPlay = "screeches";

    Violin() {
        this.formatElectricGuitarForPlay = formatElectricGuitarForPlay;
        super.name = "Violin";
        super.numberOfStrings = 4;
    }

    @Override
    void play() {
        System.out.printf(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " + formatElectricGuitarForPlay + "\n");
    }
}
