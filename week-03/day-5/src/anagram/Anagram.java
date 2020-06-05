package anagram;

import java.util.ArrayList;

public class Anagram {
//    Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
//    Create a test for that.

    public Anagram() {
    }

    public boolean isAnagram(String word, String drow) {
        int sameCharCounter = 0;
        char[] cWord = word.toCharArray();
        char[] cDrow = drow.toCharArray();
        if (cWord.length == cDrow.length){
            for (char value : cWord) {
                for (char c : cDrow) {
                    if (value == c) {
                        sameCharCounter++;
                    }
                }
            }
        }
        return sameCharCounter == cWord.length;


    }
}
