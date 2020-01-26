import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_550 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            int year = 0;
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
            }
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                bufferedWriter.write(String.format("12/09/%04d", year));
            } else {
                bufferedWriter.write(String.format("13/09/%04d", year));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
