package copy_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a filename: ");
        String file1 = input.nextLine();
        Path filePath1 = Paths.get(file1);
        System.out.println("Enter another filename: ");
        String file2 = input.nextLine();
        Path filePath2 = Paths.get(file2);

        writeFile(filePath1, filePath2);
        System.out.println(writeFile(filePath1, filePath2));
    }

    public static boolean writeFile(Path fileOld, Path fileNew){
        try {
            List<String> lines;
            lines = Files.readAllLines(fileOld);
            Files.write(fileNew, lines);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
