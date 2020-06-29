package exercise_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
    String s = "Write a Stream Expression to concatenate a Character list to a string!";
    List<Character> charList = s.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.toList());

    charList.stream()
        .forEach(c -> System.out.print(c.toString()));
    
  }

}
