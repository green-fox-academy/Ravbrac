package pirates;

public class BattleApp {
    public static void main(String[] args) {
//        Create a BattleApp class with a main method
//                Create 2 ships, fill them with pirates
//        Have a battle!

        Ship blackPearl = new Ship("Black Pearl");
        Ship flyingDutchman = new Ship("Flying Dutchman");

        blackPearl.fillShip(1000);
        flyingDutchman.fillShip(1000);


        if (blackPearl.battle(flyingDutchman)){
            System.out.println("The crew of the Black Pearl wins!");
        }else {
            System.out.println("The crew of the Flying Dutchman wins!");
        }
        System.out.println();

        blackPearl.captain.howsItgoingMate();
        flyingDutchman.captain.howsItgoingMate();

        blackPearl.shipStatus();
        flyingDutchman.shipStatus();
    }
}
