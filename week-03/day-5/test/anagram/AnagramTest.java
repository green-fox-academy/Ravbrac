package anagram;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isAnagramTest() {
        Anagram anagramTest = new Anagram();
        assertTrue(anagramTest.isAnagram("study", "dusty"));
    }

    @Test
    public void isNotAnagramTest() {
        Anagram anagramTest = new Anagram();
        assertFalse(anagramTest.isAnagram("study", "duffy"));
    }

    @Test
    public void isLongerTest() {
        Anagram anagramTest = new Anagram();
        assertFalse(anagramTest.isAnagram("study", "dusty "));
    }

    @Test
    public void isShorterTest() {
        Anagram anagramTest = new Anagram();
        assertFalse(anagramTest.isAnagram("study", "dust"));
    }
}