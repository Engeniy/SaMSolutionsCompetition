import java.io.*;
import java.util.Scanner;

public class Task_58 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            int countOfArrays = 0;
            if (scanner.hasNextInt()) {
                countOfArrays = scanner.nextInt();
            }

            outer:
            for (int times = 0; times < countOfArrays; times++) {
                int countOfRows = 0;
                int countOfColumns = 0;
                if (scanner.hasNextInt()) {
                    countOfRows = scanner.nextInt();
                }
                if (scanner.hasNextInt()) {
                    countOfColumns = scanner.nextInt();
                }

                int[][] array = new int[countOfRows][countOfColumns];

                for (int i = 0; i < countOfRows; i++) {
                    for (int j = 0; j < countOfColumns; j++) {
                        if (scanner.hasNextInt()) {
                            array[i][j] = scanner.nextInt();
                        }
                    }
                }

                int controlSum = 0;
                for (int i = 0; i < countOfRows - 1; i++) {
                    for (int j = 0; j < countOfColumns - 1; j++) {
                        controlSum = array[i][j] + array[i][j + 1] + array[i + 1][j] + array[i + 1][j + 1];
                        if (controlSum == 0 || controlSum == 4) {
                            bufferedWriter.write("NO\n");
                            continue outer;
                        }
                    }
                }
                bufferedWriter.write("YES\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

