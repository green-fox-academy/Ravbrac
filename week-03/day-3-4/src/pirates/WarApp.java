package pirates;

public class WarApp {
  public static void main(String[] args) {
    Armada fleet1 = new Armada("Fleet1");
    Armada fleet2 = new Armada("Fleet2");

    fleet1.fillArmada(100, 500);
    fleet2.fillArmada(100, 500);

    System.out.println("Starting ships off the attacker's armada: " + fleet1.ships.size());
    System.out.println();
    System.out.println("Starting ships off the defender's armada: " + fleet2.ships.size());
    System.out.println();

    if (fleet1.war(fleet2)) {
      System.out.println("The attacker's armada won!");
      System.out.println("Surviving ships off the winner's armada: " + fleet1.ships.size());
    } else {
      System.out.println("The defender's armada won!");
      System.out.println("Surviving ships off the winner's armada: " + fleet2.ships.size());
    }


  }
}
