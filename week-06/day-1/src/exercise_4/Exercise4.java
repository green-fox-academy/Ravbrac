package exercise_4;

import java.util.Arrays;
import java.util.List;

public class Exercise4 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    numbers.stream()
        .filter(p -> p % 2 != 0)
        .mapToInt(p -> p)
        .average()
        .ifPresent(p -> System.out.println(Math.round(p * 1000.0) / 1000.0));
  }
}
