package draw_pyramid;

import java.util.*;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = input.nextInt();

        for (int i = 1; i <= amount * 2; i+= 2) {
            for (int j = 1; j <= amount - i / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
