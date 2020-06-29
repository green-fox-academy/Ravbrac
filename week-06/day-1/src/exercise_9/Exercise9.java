package exercise_9;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    String sentence =
        "Write a Stream Expression to find the frequency of characters in a given string!";

   findCharFrequency(sentence);

  }

  public static void findCharFrequency(String string) {
    Arrays.stream(string.toLowerCase().split(""))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .forEach((k, v) -> System.out.println(k + ":" + v));
  }
}
