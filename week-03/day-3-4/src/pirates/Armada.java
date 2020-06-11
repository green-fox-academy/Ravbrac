package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
  List<Ship> ships;
  String armadaName;

  public Armada(String armadaName) {
    this.armadaName = armadaName;
    this.ships = new ArrayList<>();
  }

  public void fillArmada(int maxShips, int maxCrew) {
    Random random = new Random();
    int numberOfShips = random.nextInt(maxShips + 1);

    for (int i = 0; i < numberOfShips; i++) {
      Ship ship = new Ship();
      ship.fillShip(maxCrew);
      ships.add(ship);
    }
  }

  public boolean war(Armada otherArmada) {
    if (this.ships.size() == 0) {
      return false;
    } else if (otherArmada.ships.size() == 0) {
      return true;
    }else if (this.ships.get(0).battle(otherArmada.ships.get(0))) {
      otherArmada.ships.remove(0);
      this.war(otherArmada);
    } else {
      this.ships.remove(0);
      otherArmada.war(this);
    }
      return this.war(otherArmada);
  }

}
