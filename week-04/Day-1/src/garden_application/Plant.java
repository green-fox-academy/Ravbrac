package garden_application;

public class Plant {
    String color;
    String type;
    double waterAmount;
    int waterNeeded;
    double waterAbsorbtion;

    public Plant(String color) {
        this.color = color;
        this.type = "generic plant";
        this.waterAmount = 0;
        this.waterNeeded = 1;
        this.waterAbsorbtion = 1;
    }
}
