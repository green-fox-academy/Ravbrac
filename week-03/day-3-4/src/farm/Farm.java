package farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
//    Reuse your Animal class
//    Create a Farm class
//    it has list of Animals
//                    it has slots which defines the number of free places for animals
//    breed() -> creates a new animal if there's place for it
//    slaughter() -> removes the least hungry animal

    List<Animal> animals;
    int slots;

    public Farm(int slots) {
        this.animals = new ArrayList<>();
        this.slots = slots;
    }


    public void breed() {
        if (animals.size() < slots)
        animals.add(new Animal());
    }

    public void slaughter() {
        int highestHunger = animals.get(0).getHunger();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getHunger() > highestHunger){
                highestHunger = animals.get(i).getHunger();
            }
        }
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getHunger() == highestHunger){
                animals.remove(animals.get(i));
                break;
            }
        }



    }
}
