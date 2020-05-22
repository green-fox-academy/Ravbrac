package mile_to_km_converter;

import java.util.*;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        double multiplier = 1.609344;
        double miles;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter miles: ");
        miles = scan.nextDouble();

        System.out.println((miles * multiplier) + " Km");
    }
}
