package flyable;

public class Helicopter extends Vehicle implements Flyable {

    public Helicopter() {
        this.name = "helicopter";
        this.color = "white";
        this.fuelAmount = 0;
    }

    public Helicopter(String name, String color, int fuelAmount) {
        super(name, color, fuelAmount);
    }

    @Override
    public void land() {
        System.out.println("Lands on it's... what's it called thingies");
    }

    @Override
    public void fly() {
        System.out.println("Flies using it's propellers");
    }

    @Override
    public void takeOff() {
        System.out.println("Takes off with it's propellers");
    }
}
