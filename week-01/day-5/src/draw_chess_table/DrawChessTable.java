package draw_chess_table;

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the amount: ");
        int amount = input.nextInt();

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < amount; j++) {
                if ((i +j) % 2 == 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}
