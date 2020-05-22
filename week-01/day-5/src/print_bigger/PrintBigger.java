package print_bigger;

import java.util.*;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        double a;
        double b;

        Scanner inputA = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        a = inputA.nextDouble();

        Scanner inputB = new Scanner (System.in);
        System.out.println("Enter the second number: ");
        b = inputB.nextDouble();

        if (a >= b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
