import java.io.*;
import java.util.Scanner;

public class Task_46 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {

            int[] pi = {2, 7, 1, 8, 2, 8, 1, 8, 2, 8, 4, 5, 9, 0, 4, 5, 2, 3, 5, 3, 6, 0, 2, 8, 7, 5};
            StringBuilder result = new StringBuilder();

            int n = 0;
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            }
            if (n != 0) {
                for (int i = 0; i <= n; i++) {
                    if (i == 1) {
                        result.append(".");
                    }
                    if (i == n && n != 25 && pi[n + 1] >= 5) {
                        pi[i] = pi[i] + 1;
                    }
                    result.append(pi[i]);
                }
                bufferedWriter.write(result.toString());
            } else {
                bufferedWriter.write("3");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
