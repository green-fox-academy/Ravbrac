package pirates;

import java.util.ArrayList;
import java.util.Random;

public class Armada {
  ArrayList<Ship> ships;
  String armadaName;

  public Armada(String armadaName) {
    this.armadaName = armadaName;
    this.ships = new ArrayList<>();
  }

  public void fillArmada(int maxShips, int maxCrew) {
    Random random = new Random();
    int numberOfShips = random.nextInt(maxShips);

    for (int i = 0; i < numberOfShips; i++) {
      Ship ship = new Ship();
      ship.fillShip(maxCrew);
      ships.add(ship);
    }
  }

  public void war(Armada otherArmada) {
    int largerArmadaSize;
    if (this.ships.size() > otherArmada.ships.size()) {
      largerArmadaSize = this.ships.size();
    } else {
      largerArmadaSize = otherArmada.ships.size();
    }
    for (int i = 0; i < largerArmadaSize; i++) {
      this.ships.get(i).battle(otherArmada.ships.get(i));
    }
  }
}
