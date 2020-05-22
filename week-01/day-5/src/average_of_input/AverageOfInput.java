package average_of_input;

import java.util.*;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        int a;
        int b;
        int c;
        int d;
        int e;

        Scanner inputA = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        a = inputA.nextInt();

        Scanner inputB = new Scanner (System.in);
        System.out.println("Enter the second number: ");
        b = inputB.nextInt();

        Scanner inputC = new Scanner (System.in);
        System.out.println("Enter the third number: ");
        c = inputC.nextInt();

        Scanner inputD = new Scanner (System.in);
        System.out.println("Enter the fourth number: ");
        d = inputD.nextInt();

        Scanner inputE = new Scanner (System.in);
        System.out.println("Enter the fifth number: ");
        e = inputE.nextInt();

        int sum = a + b + c + d + e;

        System.out.println("Sum: " + sum + " Avarage: " + ((double)sum / 5));
    }
}
