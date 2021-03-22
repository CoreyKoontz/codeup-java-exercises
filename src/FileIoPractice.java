import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIoPractice {

    // ------------------------------------------------------ Methods:

    public static List<String> removeLine(String line, Path p, List<String> list){
        list.remove(line);
        return list;
    }

    public static void main(String[] args) {
        Path p = Paths.get("fileIo", "people.txt");

        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(p);
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : lines) {
            System.out.printf("%s works at Codeup.%n", line);
        }

        // -------------------------------------------------- Setting people.text to breakout room names:
        List<String> newNames = Arrays.asList("Audi", "Carlos", "Corey", "Sam");

        try {
            Files.write(p, newNames);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // -------------------------------------------------- Setting it back to instructor names:
        lines = Arrays.asList("Justin", "Casey", "Ry", "David");

        try {
            Files.write(p, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        removeLine("David", p, lines);



    }

}
