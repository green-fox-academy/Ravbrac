package draw_diamond;

import java.util.*;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an odd number: ");
        int amount = input.nextInt();

        if (amount % 2 == 0) {
            System.out.println("It's an even number!");
        } else {
            for (int i = 1; i <= amount; i+= 2) {
                for (int j = 1; j <= (amount - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }

                System.out.println("");
            }
            for (int l = 1; l < amount; l+= 2) {
                for (int j = 0; j <= l / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = amount - l - 1; k > 0; k--) {
                    System.out.print("*");
                }

                System.out.println("");
            }
        }

        // Note: Likely not the most effective solution, maybe I'll try to find a better one later.
    }
}
