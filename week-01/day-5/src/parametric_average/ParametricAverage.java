package parametric_average;

import java.util.*;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the amount: ");
        int amount = input.nextInt();
        int sum = 0;

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter an integer: ");
            int integer = input.nextInt();
            sum+= integer;
        }

        double average = (double) sum / amount;

        System.out.println("Sum: " + sum + ", " + "Average: " + average);
    }
}
