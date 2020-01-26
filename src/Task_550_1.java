import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task_550_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            final int INDEX_DAY = 255 + 1;
            int year = 0;
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
            }

            String day = LocalDate
                    .ofYearDay(year, INDEX_DAY)
                    .format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy"));
            bufferedWriter.write(day);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
