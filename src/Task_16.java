import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_16 {
    private static int stairs(int previousLevel, int numberOfCubes) {
        if (numberOfCubes == 0)
            return 1;
        int count = 0;
        for (int level = 1; level < previousLevel; ++level) {
            if ((numberOfCubes - level) < 0)
                break;
            count += stairs(level, numberOfCubes - level);
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            int n = 0;
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
            }
            int numberOfStairs = stairs(n + 1, n);
            bufferedWriter.write(String.valueOf(numberOfStairs));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
