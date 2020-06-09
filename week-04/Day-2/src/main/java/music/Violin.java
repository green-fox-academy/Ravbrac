package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        this.name = "Violin";
        this.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
        this.name = "Violin";
    }

    @Override
    public String sound() {
        return "Screech";
    }


}
