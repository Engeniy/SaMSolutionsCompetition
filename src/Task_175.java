import java.io.*;

public class Task_175 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("INPUT.TXT"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT.TXT"))) {
            int h, m;
            String[] times = bufferedReader.readLine().split(":");
            h = Integer.parseInt(times[0]);
            m = Integer.parseInt(times[1]);
            int dst, result;
            if (h < 10) {
                dst = 20;
            } else if (h < 17) {
                dst = 24;
            } else if (h < 20) {
                dst = 24 + 5;
            } else {
                dst = 24 + 10;
            }
            result = dst * 60 - (h * 60 + m);
            bufferedWriter.write(String.valueOf(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
