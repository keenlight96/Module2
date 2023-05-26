package Task3_id9289;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadWrite {
    static File file = new File("src/Task3_id9289/data/products.txt");

    public static List<Product> read() {
        List<Product> products = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            products = (List<Product>) objectInputStream.readObject();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return products;
    }

    public static void write(List<Product> products) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(products);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
