import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            int n = 0;
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            }
            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                if (scanner.hasNextInt()) {
                    numbers[i] = scanner.nextInt();
                }
            }
            for (int p = 1; p <= n - 1; p++) {
                if ((n - 1) % p == 0) {
                    boolean answer = true;
                    for (int i = p; i < n - 1; i++) {
                        if (numbers[i] != numbers[i - p]) {
                            answer = false;
                            break;
                        }
                    }
                    if (answer) {
                        bufferedWriter.write(String.valueOf(p));
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
