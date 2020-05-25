package factorio;

import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the amount: ");
        int amount = input.nextInt();

        System.out.println(factorio(amount));
    }

    public static int factorio(int input) {
        int factorOfNum = 1;

        for (int i = input; i > 0; i--) {
            factorOfNum *= i;
        }
        return factorOfNum;
    }
}
