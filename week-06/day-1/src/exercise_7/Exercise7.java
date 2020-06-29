package exercise_7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");

//   cities.stream()
//        .filter(p -> p.startsWith("A"))
//        .forEach(System.out::println);

    startsWithLetter(cities, "A");
    startsWithLetter(cities, "N");


  }

  public static void startsWithLetter(List<String> list, String letter) {
    System.out.println("Starts with letter " + "'" + letter + "'");

    list.stream()
        .filter(p -> p.startsWith(letter))
        .forEach(System.out::println);

    System.out.println();
  }
}
