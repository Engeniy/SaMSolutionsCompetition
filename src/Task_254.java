import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task_254 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            int countOfCounties = 0;
            if (scanner.hasNextInt()) {
                countOfCounties = scanner.nextInt();
            }

            int[] beforeElection = new int[countOfCounties];
            int[] afterElection = new int[countOfCounties];
            for (int i = 0; i < countOfCounties; i++) {
                if (scanner.hasNextInt()) {
                    beforeElection[i] = scanner.nextInt();
                    afterElection[i] = beforeElection[i];
                }
            }

            int countOfRequests = 0;
            if (scanner.hasNextInt()) {
                countOfRequests = scanner.nextInt();
            }

            for (int i = 0; i < countOfRequests; i++) {
                int currentPriest = 0;
                int desiredPriest = 0;
                if (scanner.hasNextInt()) {
                    currentPriest = scanner.nextInt();
                }
                if (scanner.hasNextInt()) {
                    desiredPriest = scanner.nextInt();
                }

                for (int j = 0; j < countOfCounties; j++) {
                    if (beforeElection[j] == currentPriest) {
                        afterElection[j] = desiredPriest;
                    }
                }
            }
            String result = Arrays.toString(afterElection).replaceAll("[,\\[\\]]", "");
            bufferedWriter.write(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
