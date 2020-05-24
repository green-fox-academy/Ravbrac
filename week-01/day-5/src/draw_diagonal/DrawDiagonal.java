package draw_diagonal;

import java.util.*;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the amount: ");
        int amount = input.nextInt();

        for (int i = 0; i < amount; i++) {
            System.out.print("%");
        }

        System.out.println("");

        for (int i = 0; i < amount-2; i++) {
            for (int j = 0; j < amount; j++) {
                if (j == 0 || j == i + 1 || j == amount - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

        for (int i = 0; i < amount; i++) {
            System.out.print("%");
        }
    }
}
