package sum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    @Before
    public void setUp() {

    }

    @Test
    public void sumMultiple() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Sum sum = new Sum(list);

        assertEquals((Integer)10, sum.summer());
    }

    @Test
    public void sumEmpty() {
        ArrayList<Integer> list = new ArrayList<>();

        Sum sum = new Sum(list);

        assertEquals((Integer)0, sum.summer());
    }

    @Test
    public void sumOne() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        Sum sum = new Sum(list);

        assertEquals((Integer)4, sum.summer());
    }

//    @Test(expected = NullPointerException.class)
//    public void sumNull() {
//        ArrayList<Integer> list = null;
//        Sum sum = new Sum(list);
//    }
//    Cannot do this last test, because there is no "assertThrows" in junit4, and can't get the "expected" attribute working
}