package Task1_id9286;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        readFileText("src/Task1_id9286/number.txt");

    }

    public static void readFileText(String filePath) {
        try{
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Sum = " + sum);
        } catch (Exception exception) {
            System.err.println("File doesn't exist");
        }
    }
}

