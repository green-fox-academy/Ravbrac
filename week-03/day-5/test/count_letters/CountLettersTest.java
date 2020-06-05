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

    @Test
    public void wrongValue() {
        CountLetters counter = new CountLetters();
        String word = "grammar";

        HashMap<Character, Integer> testMap = new HashMap<>();
        testMap.put(word.toCharArray()[0], 1);
        testMap.put(word.toCharArray()[1], 1);
        testMap.put(word.toCharArray()[2], 1);
        testMap.put(word.toCharArray()[3], 1);

        assertNotEquals(testMap, counter.letterCounter(word));
    }

    @Test
    public void wrongKey() {
        CountLetters counter = new CountLetters();
        String word = "grammar";
        String wrongWord = "qwerqw";

        HashMap<Character, Integer> testMap = new HashMap<>();
        testMap.put(wrongWord.toCharArray()[0], 1);
        testMap.put(wrongWord.toCharArray()[1], 2);
        testMap.put(wrongWord.toCharArray()[2], 2);
        testMap.put(wrongWord.toCharArray()[3], 2);

        assertNotEquals(testMap, counter.letterCounter(word));
    }
}