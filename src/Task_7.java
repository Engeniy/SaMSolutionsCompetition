import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            String[] numbers = bufferedReader.readLine().split(" ");
            BigInteger max = Arrays.stream(numbers)
                    .map(BigInteger::new)
                    .max(BigInteger::compareTo)
                    .get();
            bufferedWriter.write(max.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
