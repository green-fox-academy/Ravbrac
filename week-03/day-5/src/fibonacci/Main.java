package fibonacci;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index:");

        int input = scanner.nextInt();
        System.out.println(fibonacci.fibonacciAtIndex(input));
    }
}
