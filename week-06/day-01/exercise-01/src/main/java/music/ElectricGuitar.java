package main.java.music;

class ElectricGuitar extends StringedInstrument {
    private String formatElectricGuitarForPlay = "twangs";

    ElectricGuitar(int numberOfStrings) {
        super.numberOfStrings = numberOfStrings;
        super.name = "ElectricGuitar";
        this.formatElectricGuitarForPlay = formatElectricGuitarForPlay;
    }

    ElectricGuitar() {
        super.name = "ElectricGuitar";
        super.numberOfStrings = 6;
        this.formatElectricGuitarForPlay = formatElectricGuitarForPlay;
    }

    @Override
    void play() {
        System.out.printf(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " + formatElectricGuitarForPlay + "\n");
    }
}
