import java.io.*;
import java.util.Scanner;

public class Task_53 {
    public static void main(String[] args) {
        int n = 0, m = 0, red = 0, green = 0, blue = 0, black = 0;

        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            }
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if ((i * j) % 5 != 0 & (i * j) % 3 != 0 & (i * j) % 2 == 0) {
                        red++;
                    } else if ((i * j) % 5 != 0 & (i * j) % 3 == 0) {
                        green++;
                    } else if ((i * j) % 5 == 0) {
                        blue++;
                    }
                }
            }
            black = n * m - green - blue - red;
            bufferedWriter.write("RED : " + red + "\n");
            bufferedWriter.write("GREEN : " + green + "\n");
            bufferedWriter.write("BLUE : " + blue + "\n");
            bufferedWriter.write("BLACK : " + black + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
