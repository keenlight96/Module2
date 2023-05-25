package Task4_id9284;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\Task4_id9284\\source.csv");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                String[] ar = str.split(",");
                System.out.println(ar[2]);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
