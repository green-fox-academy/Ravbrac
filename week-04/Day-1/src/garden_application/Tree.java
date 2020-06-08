package garden_application;

public class Tree extends Plant{
    public Tree(String color) {
        super(color);
        this.type = "Tree";
        this.waterNeeded = 10;
        this.waterAbsorbtion = 0.4;
    }
}
