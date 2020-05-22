package animals_and_legs;

import java.util.*;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        int chickens;
        int pigs;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of chickens: ");
        chickens = input.nextInt();
        System.out.println("Enter the number of pigs: ");
        pigs = input.nextInt();

        System.out.println("The total number of legs is: " + ((chickens * 2) + (pigs * 4)) + " legs");
    }
}
