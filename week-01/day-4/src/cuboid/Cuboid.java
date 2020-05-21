package cuboid;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double a;
        Scanner objA = new Scanner(System.in);
        System.out.println( "Enter side a: ");
        a = objA.nextDouble();

        double b;
        Scanner objB = new Scanner(System.in);
        System.out.println( "Enter side b: ");
        b = objB.nextDouble();

        double c;
        Scanner objC = new Scanner(System.in);
        System.out.println( "Enter side c: ");
        c = objC.nextDouble();

        System.out.println("Surface Area = " + (int)((2 * a *b) + (2 * a * c) + (2 *b * c)));
        System.out.println("Volume = " + (int)(a * b * c));
    }
}
