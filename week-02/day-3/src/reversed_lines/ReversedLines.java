package reversed_lines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    reverseLines("reversed-lines.txt");
  }

  public static void reverseLines(String fileName) {
    Path filePath = Paths.get(fileName);
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        StringBuilder builder = new StringBuilder();
        String line = lines.get(i);
        for (int j = line.length(); j > 0; j--) {
          char c = line.charAt(j - 1);
          builder.append(c);
        }
        System.out.println(builder.toString());
      }
    } catch (IOException e) {
      System.exit(2);
    }
  }
}
