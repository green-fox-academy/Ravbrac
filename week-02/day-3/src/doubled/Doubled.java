package doubled;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        Path filePath = Paths.get("duplicated-chars.txt");

        try {
            List<String> lines;
            lines = Files.readAllLines(filePath);

            for (int i = 0; i < lines.size(); i++) {
                StringBuilder builder = new StringBuilder();
                String line = lines.get(i);
                for (int j = 0; j < line.length(); j+= 2) {
                    char c = line.charAt(j);
                    builder.append(c);
                }
                System.out.println(builder.toString());
            }
        } catch (IOException e){
            System.exit(2);
        }
 //       Files.write(fileNew, lines);
    }

}
