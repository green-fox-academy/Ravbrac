package printable_interface;

public class Domino implements Printable {
    int sideA;
    int sideB;

    public Domino(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + sideA + ", B side: " + sideB);
    }
}
