package Task3_id9282;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

public class Main {
    public static void main(String[] args) {
        copyTextFile("src/Task3_id9282/source.txt", "src/Task3_id9282/target.txt");
    }

    public static void copyTextFile(String pathSource, String pathTarget) {
        try {
            File fileSource = new File(pathSource);
            File fileTarget = new File(pathTarget);

            if (!fileSource.exists()) {
                throw new FileNotFoundException();
            }

            if (fileTarget.exists()) {
                throw new FileAlreadyExistsException(pathTarget);
            }

            BufferedReader br = new BufferedReader(new FileReader(fileSource));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileTarget));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line + "\n");
            }

            br.close();
            bw.close();

        } catch (FileNotFoundException exception) {
            System.err.println("Source file not found " + exception.getMessage());
        } catch (FileAlreadyExistsException exception) {
            System.err.println("Target file exists " + exception.getMessage());
        } catch (Exception exception) {
            exception.getStackTrace();
        }
    }
}
