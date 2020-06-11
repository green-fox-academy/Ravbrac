package lottery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lottery {
  public static void main(String[] args) {

  }

  public static void commonNumberFinder(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> allLotteryNumbers = new ArrayList<>();
    HashMap<Integer, Integer> numberOccurrences = new HashMap<>();
    try {
      List<String> lines = Files.readAllLines(filePath);

      for (int i = lines.size() - 5; i < lines.size(); i++) {
        String[] lotteryNumbers = lines.get(i).split(";");
        allLotteryNumbers.addAll(Arrays.asList(lotteryNumbers));
      }
      Collections.sort(allLotteryNumbers);

      for (int i = 1; i < 90; i++) {
        String numberString = Integer.toString(i);
        int counter = 0;
          for (int j = 0; j < allLotteryNumbers.size(); j++) {
            if (numberString.equals(allLotteryNumbers.get(j))) {
              counter++;
            }
          }
          numberOccurrences.put(i, counter);
        }

      

    } catch (IOException e) {
      System.exit(2);
    }

  }
}
