package garden_application;

public class Flower extends Plant {
    public Flower(String color) {
        super(color);
        this.type = "Flower";
        this.waterNeeded = 5;
        this.waterAbsorbtion = 0.75;
    }
}
