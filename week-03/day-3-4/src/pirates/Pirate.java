package pirates;

import java.util.Random;

public class Pirate {
//    Create a Pirate class. While you can add other fields and methods, you must have these methods:-
//
//    drinkSomeRum() - intoxicates the Pirate some
//    howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//            0 to 4 times, "Pour me anudder!"
//            else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//    If you manage to get this far, then you can try to do the following.
//
//    die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//    brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies,
//    the other dies or they both pass out.
//    And... if you get that far...
//
//    Add a parrot.

    int intoxication;
    boolean passedOut;
    boolean dead;
    boolean parrot;

    public Pirate() {
        this.intoxication = 0;
        this.passedOut = false;
        this.dead = false;
        this.parrot = false;
    }

    public void drinkSomeRum() {
        if (dead){
            System.out.println("He's dead");
        }else {
            intoxication++;
        }

    }

    public void howsItgoingMate() {
        if (dead){
            System.out.println("He's dead");
        }else if (intoxication <= 4){
            System.out.println("Pour me anudder!");
        }else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passedOut = true;
            intoxication = 0;
        }
    }

    public void die() {
        dead = true;
        parrot = false;
    }

    public void brawl(Pirate x) {
        Random random = new Random();
        int chance = random.nextInt(2);
        if (dead || x.dead){
            System.out.println("He's dead");
        }else if (chance == 0){
            die();
        }else if (chance == 1){
            x.die();
        }else if (chance == 2){
            passedOut = true;
            x.passedOut = true;
        }
    }

    public void addParrot() {
        parrot = true;
    }


}
