package Task1_id9288;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File source = new File("src/Task1_id9288/source.txt");
        File destination = new File("src/Task1_id9288/destination.txt");
        copyFile(source, destination);
    }

    public static void copyFile (File source, File destination) {

        try (InputStream inputStream = new FileInputStream(source);
             OutputStream outputStream = new FileOutputStream(destination)){
            byte[] bytes = new byte[1024];
            int length;
            while ((length = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, length);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
