import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_654 {
    public static void main(String[] args) {
        int n;
        int previous = 0;
        int current;
        int max;
        long sum = 0;

        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            }
            if (scanner.hasNextInt()) {
                previous = scanner.nextInt();
            }
            max = previous;
            while (scanner.hasNextInt()) {
                current = scanner.nextInt();
                max = Math.max(current, max);
                if (current > previous) {
                    sum += (current - previous);
                }
                previous = current;
            }
            sum += max - previous;
            bufferedWriter.write(String.valueOf(sum));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

