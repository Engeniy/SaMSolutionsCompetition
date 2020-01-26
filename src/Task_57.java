import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_57 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            int n = 0;
            int c = 0;
            long p = 0;
            int xt = 0;
            int yt = 0;
            int[] x = new int[1000];
            int[] y = new int[1000];
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            }
            if (scanner.hasNextInt()) {
                c = scanner.nextInt();
            }
            if (scanner.hasNextLong()) {
                p = scanner.nextLong();
            }

            for (int i = 0; i < n; i++) {
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                }
                if (scanner.hasNextInt()) {
                    y[i] = scanner.nextInt();
                }
            }
            if (scanner.hasNextInt()) {
                xt = scanner.nextInt();
            }
            if (scanner.hasNextInt()) {
                yt = scanner.nextInt();
            }

            double mins = p + 1;
            for (int i = 0; i < n; i++) {
                double s = 0;
                for (int j = 0; j < n; j++) {
                    int dx = x[i] - x[j];
                    int dy = y[i] - y[j];
                    s += Math.sqrt(dx * dx + dy * dy);
                    if (s > mins) {
                        break;
                    }
                }
                int dx = x[i] - xt;
                int dy = y[i] - yt;
                s += Math.sqrt(dx * dx + dy * dy);
                mins = Math.min(s, mins);
            }
            boolean answer = c * mins <= p;
            if (answer) {
                bufferedWriter.write("YES");
            } else bufferedWriter.write("NO");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
