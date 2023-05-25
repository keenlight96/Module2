package Task2_id9880;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int max = findMaxFromTextFile("src/Task2_id9880/numbers.txt");
        writeToFile("src/Task2_id9880/max.txt", max);


    }

    public static int findMaxFromTextFile(String filePath) {
        int max = 0;
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                if (count == 0) {
                    max = Integer.parseInt(line);
                } else {
                    if (Integer.parseInt(line) > max) {
                        max = Integer.parseInt(line);
                    }
                }
                count++;
            }

            br.close();

        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
        return max;
    }

    public static void writeToFile(String filePath, int number) {
        try {
            File file = new File(filePath);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            bw.write("Max = ");
            bw.write(Integer.toString(number));
            bw.close();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}
