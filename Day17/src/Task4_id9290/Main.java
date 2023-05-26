package Task4_id9290;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File source = new File("src/Task4_id9290/source.txt");
        File destination = new File("src/Task4_id9290/destination.txt");
        copyFile(source, destination);
    }

    public static void copyFile (File source, File destination) {
        if (!source.exists())
            System.out.println("Source file not found");
        if (destination.exists())
            System.out.println("Destination file exists");
        try (InputStream inputStream = new FileInputStream(source);
             OutputStream outputStream = new FileOutputStream(destination)){
            byte[] bytes = new byte[1024];
            long count = 0;
            int length;
            while ((length = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, length);
                count +=length;
            }
            System.out.println("Copied successfully. Bytes: " + count);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
