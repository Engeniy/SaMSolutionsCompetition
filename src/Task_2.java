import java.io.*;
import java.util.stream.IntStream;

public class Task_2 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            int start = 1;
            int end = 0;
            int sum = 0;
            end = Integer.parseInt(bufferedReader.readLine());
            if (end >= start) {
                sum = IntStream
                        .rangeClosed(start, end)
                        .sum();
            } else {
                sum = IntStream
                        .rangeClosed(end, start)
                        .sum();
            }
            bufferedWriter.write(String.valueOf(sum));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

