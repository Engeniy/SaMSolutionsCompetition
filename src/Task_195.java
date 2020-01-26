import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Task_195 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            List<Integer> list = new ArrayList<>();
            Integer sides = 2;
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
            list.add(sides);
            Optional<Integer> volume = list
                    .stream()
                    .reduce((result, nextElement) -> result * nextElement);
            bufferedWriter.write(String.valueOf(volume.orElse(0)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

