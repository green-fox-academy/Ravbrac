package pirates;

import java.util.ArrayList;
import java.util.Random;

public class Ship {
//    Create a Ship class.
//    The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
//    When a ship is created it doesn't have a crew or a captain.
//    The ship can be filled with pirates and a captain via fillShip() method.
//    Filling the ship with a captain and random number of pirates.
//    Ships should be represented in a nice way on command line including information about
//    captains consumed rum, state (passed out / died)
//    number of alive pirates in the crew
//    Ships should have a method to battle other ships: ship.battle(otherShip)
//    should return true if the actual ship (this) wins
//    the ship should win if its calculated score is higher
//    calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
//    The loser crew has a random number of losses (deaths).
//    The winner captain and crew has a party, including a random number of rum :)

    ArrayList<Pirate> pirates;
    String shipName;
    Pirate captain;

    public Ship(String shipName) {
        this.pirates = new ArrayList<>();
        this.shipName = shipName;
        this.captain = new Pirate();
    }

    public Ship() {
        this.pirates = new ArrayList<>();
        this.shipName = "Generic pirate ship";
        this.captain = new Pirate();
    }

    public void shipStatus() {
        System.out.println();
        System.out.println("       |X|"       + "      " + shipName);
        System.out.println("       |"         );
        System.out.println("       |D"        );
        System.out.println("  |D   |D   |D"   + "  Rum consumed by the captain: " + captain.intoxication);
        System.out.println("  |D   |D   |D"   + "  Captain's state: " + statusCaptain());
        System.out.println("__|____|____|__"  + "  Crew members alive: " + crewAlive());
        System.out.println("|............./"  );
        System.out.println("|____________/"   );
    }

    public void fillShip( int maxCrew) {
        Random random = new Random();
        pirates.add(captain);
        captain.parrot = true;
        int crew = random.nextInt(maxCrew);

        for (int i = 0; i < crew; i++) {
            Pirate pirate = new Pirate();
            pirates.add(pirate);
        }
    }

    public String statusCaptain() {
        if (captain.dead){
            return "The captain is dead!";
        }else if (captain.passedOut){
            return "The captain is passed out";
        } else {
            return "The captain is fine";
        }
    }

    public int crewAlive() {
        int counter= 0;
        for (Pirate pirate : pirates) {
            if (!pirate.dead) {
                counter++;
            }
        }
        return counter;
    }

    public boolean battle(Ship otherShip) {
        Random random = new Random();



        if (crewAlive() - captain.intoxication > otherShip.crewAlive() - otherShip.captain.intoxication){
            int rum = random.nextInt(crewAlive() * 10);
            for (int i = 0; i <= rum; i++) {
                int drunkIndex = random.nextInt(crewAlive());
                pirates.get(drunkIndex).intoxication++;
            }
            int loses = random.nextInt(otherShip.crewAlive());
            for (int i = 0; i <= loses; i++) {
                int loseIndex = random.nextInt(otherShip.crewAlive());
                otherShip.pirates.get(loseIndex).die();
            }
            return true;

        }else {
            int rum = random.nextInt(otherShip.crewAlive() * 4);
            for (int i = 0; i <= rum; i++) {
                int drunkIndex = random.nextInt(otherShip.crewAlive());
                otherShip.pirates.get(drunkIndex).intoxication++;
            }
            int loses = random.nextInt(crewAlive());
            for (int i = 0; i <= loses; i++) {
                int loseIndex = random.nextInt(crewAlive());
                pirates.get(loseIndex).die();
            }
            return false;
        }

    }
}
