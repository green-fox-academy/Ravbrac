package exercise_6;

public class Exercise6 {
  public static void main(String[] args) {
    String sentence = "Write a Stream Expression to find the uppercase characters in a string!";

    sentence.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> Character.isUpperCase(c))
        .forEach(c -> System.out.println(c));

  }
}
