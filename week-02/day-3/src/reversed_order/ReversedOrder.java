package reversed_order;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    reverseOrder("reversed-order.txt");
  }

  public static void reverseOrder(String fileName) {
    Path filePath = Paths.get(fileName);
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = lines.size(); i > 0; i--) {
        String line = lines.get(i - 1);
        System.out.println(line);
      }
    } catch (IOException e) {
      System.exit(2);
    }
  }
}
