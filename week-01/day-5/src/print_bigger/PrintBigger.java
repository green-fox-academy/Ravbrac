package print_bigger;

import java.util.*;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        double a = input.nextDouble();
        System.out.println("Enter the second number: ");
        double b = input.nextDouble();

        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
