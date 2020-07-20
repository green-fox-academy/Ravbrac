package number_converter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberConverter {
    private static Map<String, String> numberString = readFileIntoMap("numbers-in-string.txt");

    public static void main(String[] args) {

        System.out.println(converter(594));

    }

    public static String converter(Integer number) {

        char[] c =String.valueOf(number).toCharArray();

        if (number <= 99 && number > 0) {
            return getDigits(number);
        }else if(number <= 999) {
            int dividable = number % 100;

            if (dividable == 0) {
                return getDigits(Character.getNumericValue(c[0])) + " hundred";
            }else {
                return getDigits(Character.getNumericValue(c[0])) + " hundred and " + getDigits(dividable);
            }
        }
        
        return null;
    }

    public static String getDigits(int number) {
        return numberString.get(String.valueOf(number));
    }

//    public static List<String> fileReader(String fileName) {
//        List<String> lines = new ArrayList<>();
//        try {
//            Path filePath = Paths.get(fileName);
//            lines = Files.readAllLines(filePath);
//        } catch (IOException e) {
//            System.out.println("Look like is doesn't work!");
//            System.exit(2);
//        }
//        return lines;
//    }

    public static Map<String, String > readFileIntoMap(String filePath) {

        try {
            Path path = FileSystems.getDefault().getPath(filePath);
            Map<String, String> mapFromFile = Files.lines(path)
//                    .filter(s -> s.matches("^\\w+:\\w+"))
                    .collect(Collectors.toMap(k -> k.split(":")[0], v -> v.split(":")[1].toLowerCase()));
            return mapFromFile;
        } catch (IOException e) {
            System.out.println("Look like is doesn't work!");
            System.exit(2);
        }
        return null;
    }
}
