package flyable;

public abstract class Vehicle {
    String name;
    String color;
    int fuelAmount;

    public Vehicle() {
    }

    public Vehicle(String name, String color, int fuelAmount) {
        this.name = name;
        this.color = color;
        this.fuelAmount = fuelAmount;
    }
}
