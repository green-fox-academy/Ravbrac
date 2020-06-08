package garden_application;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> plants;

    public Garden() {
        this.plants = new ArrayList<>();

    }

    public void addFlower(Flower flower) {
        plants.add(flower);
    }

    public void addTree(Tree tree) {
        plants.add(tree);
    }

    public void waterPlants(double amount) {
        int counter = 0;
        for (Plant plant : plants){
            if (plant.waterAmount < plant.waterNeeded){
                counter++;
            }
        }
        if (counter > 0){
            for (Plant plant : plants) {
                if (plant.waterAmount < plant.waterNeeded) {
                    plant.waterAmount += (amount / counter) * plant.waterAbsorbtion;
                }
            }
        }

        System.out.println("Watering with " + amount);
    }

    public void gardenInfo() {
        for (Plant plant : plants) {
            if (plant.waterAmount < plant.waterNeeded) {
                System.out.println("The " + plant.color + " " + plant.type + " needs water");
            } else {
                System.out.println("The " + plant.color + " " + plant.type + " doesnt need water");
            }
        }
    }
}
