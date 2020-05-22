package odd_even;

import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        int amount;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the amount: ");
        amount = input.nextInt();

        if (amount % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
