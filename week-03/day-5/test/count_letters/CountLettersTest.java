package count_letters;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void letterCounterTest() {
        CountLetters counter = new CountLetters();
        String word = "grammar";

        HashMap<Character, Integer> testMap = new HashMap<>();
        testMap.put(word.toCharArray()[0], 1);
        testMap.put(word.toCharArray()[1], 2);
        testMap.put(word.toCharArray()[2], 2);
        testMap.put(word.toCharArray()[3], 2);

        assertEquals(testMap, counter.letterCounter(word));

    }
}