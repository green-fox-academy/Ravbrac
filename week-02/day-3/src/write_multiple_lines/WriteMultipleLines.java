package write_multiple_lines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file's location: ");
        String  fileLocation = input.nextLine();
        Path filePath = Paths.get(fileLocation);
        System.out.println("Enter the word: ");
        String wordToAdd = input.nextLine();
        System.out.println("Enter a number: ");
        int numberOfLines = input.nextInt();

        writeFile(filePath, wordToAdd, numberOfLines);
    }

    public static void writeFile(Path fileName, String word, int number){
        ArrayList<String> content = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            content.add(word);
        }
        try {
            Files.write(fileName, content);
        } catch (IOException e) {
            System.exit(2);
        }
    }
}
