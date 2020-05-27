package divide_by_zero;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int divisor = input.nextInt();
        tenDivide(divisor);
    }

    public static void tenDivide(int number){
        try {
            int divided = 10 / number;
            System.out.println(divided);
        } catch (ArithmeticException e){
            System.out.println("Fail");
            System.exit(1);
        }

    }
}
