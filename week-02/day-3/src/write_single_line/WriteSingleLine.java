package write_single_line;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        writeFile("my-file.txt", "Adam Soltesz");

    }
    public static void writeFile(String fileName, String name){
        ArrayList<String> content = new ArrayList<>();
        content.add(name);
        try {
            Path filePath = Paths.get(fileName);
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
            System.exit(2);
        }
    }
}
