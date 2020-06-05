package fibonacci;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class FibonacciTest {



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void fibonacciAtIndex0() {
        Fibonacci fibonacci = new Fibonacci();
        int fIndex = 0;

        assertEquals(0, fibonacci.fibonacciAtIndex(fIndex));
    }

    @Test
    public void fibonacciAtIndex1() {
        Fibonacci fibonacci = new Fibonacci();
        int fIndex = 1;

        assertEquals(1, fibonacci.fibonacciAtIndex(fIndex));

    }
    @Test
    public void fibonacciAtIndex2() {
        Fibonacci fibonacci = new Fibonacci();
        int fIndex = 2;

        assertEquals(1, fibonacci.fibonacciAtIndex(fIndex));
    }

    @Test
    public void fibonacciAtIndex5() {
        Fibonacci fibonacci = new Fibonacci();
        int fIndex = 5;

        assertEquals(5, fibonacci.fibonacciAtIndex(fIndex));
    }

    @Test
    public void fibonacciAtIndex9() {
        Fibonacci fibonacci = new Fibonacci();
        int fIndex = 9;

        assertEquals(34, fibonacci.fibonacciAtIndex(fIndex));
    }

    @Test
    public void fibonacciAtIndexMinus() {
        Fibonacci fibonacci = new Fibonacci();
        int fIndex = -1;

        try {
            fibonacci.fibonacciAtIndex(fIndex);
        }catch (IndexOutOfBoundsException exception) {
            System.out.println("Index is negative");
        }
    }

    @Test
    public void fibonacciAtIndexHigh() {
        Fibonacci fibonacci = new Fibonacci();
        int fIndex = 77;

        assertEquals(-1036647147, fibonacci.fibonacciAtIndex(fIndex));
    }
}