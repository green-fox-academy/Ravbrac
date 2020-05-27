package count_lines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a filename: ");
        String file0 = input.nextLine();

        System.out.println(numberOfLines(file0));
    }
    public static int numberOfLines(String filename){
        int counter = 0;
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                counter++;
            }
            return counter;
        } catch (IOException e) {
            return 0;
        }

    }
}
