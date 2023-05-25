package Task2_id9880;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMaxFromTextFile("src/Task2_id9880/numbers.txt"));

    }

    public static int findMaxFromTextFile(String filePath) {
        int max = 0;
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            int count =0;
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
}
