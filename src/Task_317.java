import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_317 {
    public static void main(String[] args) {
        int x = 0, y = 0, z = 0, w = 0, count = 0;

        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
            }
            if (scanner.hasNextInt()) {
                y = scanner.nextInt();
            }
            if (scanner.hasNextInt()) {
                z = scanner.nextInt();
            }
            if (scanner.hasNextInt()) {
                w = scanner.nextInt();
            }
            for (int i = 0; i <= w / x; i++) {
                for (int j = 0; j <= (w - x * i) / y; j++) {
                    if ((w - (x * i + y * j)) % z == 0) {
                        count++;
                    }
                }
            }
            bufferedWriter.write(String.valueOf(count));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
