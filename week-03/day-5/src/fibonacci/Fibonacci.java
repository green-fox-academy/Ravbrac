package fibonacci;

import java.util.ArrayList;

public class Fibonacci {
//    0, 1, 1, 2, 3, 5, 8, 13, 21, 34...

//    Write a function that computes a member of the fibonacci sequence by a given index
//    Create tests for multiple test cases.

    public int fibonacciAtIndex(int index) {

        ArrayList<Integer> fibonaciNumbers = new ArrayList<>();
        if (index >= 0){
            fibonaciNumbers.add(0);
        }
        if (index > 0){
            fibonaciNumbers.add(1);
        }
        if (index > 1){
            for (int i = 1; i < index; i++) {
                int a = fibonaciNumbers.get(i - 1);
                int b = fibonaciNumbers.get(i);
                fibonaciNumbers.add(a + b);
            }
        }


        return fibonaciNumbers.get(index);
    }

//    Probably there are more elegant solutions for a Fibonacci calculator, than basically hard coding the
//    first two numbers into the list, but I couldn't figure it out just yet. Maybe after the end of the course I give
//    it another go.
}
