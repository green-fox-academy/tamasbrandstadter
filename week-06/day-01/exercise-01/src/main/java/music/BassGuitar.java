package main.java.music;

class BassGuitar extends StringedInstrument{
    private String formatElectricGuitarForPlay = "Duum-duum-duum";

    BassGuitar(int numberOfStrings) {
        super.numberOfStrings = numberOfStrings;
        super.name = "Bass Guitar";
        this.formatElectricGuitarForPlay = formatElectricGuitarForPlay;
    }

    BassGuitar() {
        super.name = "Bass Guitar";
        super.numberOfStrings = 4;
        this.formatElectricGuitarForPlay = formatElectricGuitarForPlay;
    }

    @Override
    void play() {
        System.out.printf(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " + formatElectricGuitarForPlay + "\n");
    }
}
