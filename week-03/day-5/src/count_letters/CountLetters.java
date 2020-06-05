package count_letters;

import java.util.*;

public class CountLetters {

//    Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys,
//    and numbers as values that shows how many occurrences there are.
//    Create a test for that.

    public CountLetters() {
    }

    public HashMap<Character, Integer> letterCounter(String word) {
        char[] characters = word.toCharArray();
        ArrayList<Character> charList = new ArrayList<>();
        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < characters.length; i++) {
            charList.add(characters[i]);
        }

        for (int i = 0; i < characters.length; i++) {
            int counter = 0;
            for (int j = 0; j < charList.size(); j++) {
                if (characters[i] == charList.get(j)){
                    counter++;
                }
            }
            if (!letters.containsKey(characters[i])){
                letters.put(characters[i], counter);
            }
        }

        return letters;
    }
}
