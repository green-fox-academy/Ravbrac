package sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.

        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Sum of numbers from 0 to " + number + " is: " + sum(number));
    }

    public static int sum(int until) {
        int sumTotal = 0;

        for (int i = 0; i <= until ; i++) {
            sumTotal += i;
        }
        return sumTotal;
    }
}
