package count_form_to;

import java.util.*;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        int a;
        int b;

        Scanner inputA = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        a = inputA.nextInt();

        Scanner inputB = new Scanner (System.in);
        System.out.println("Enter the second number: ");
        b = inputB.nextInt();

        if (b <= a) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = a; i < b; i++) {
                System.out.println(i);
            }
        }
    }
}
