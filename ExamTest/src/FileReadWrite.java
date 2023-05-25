import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadWrite {
    static File file = new File("src/data/products.txt");

    public static List<Product> read() {
        List<Product> products = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                String[] ar = str.split(",");
                products.add(new Product(ar[0], ar[1], Integer.parseInt(ar[2]), Integer.parseInt(ar[3]), ar[4]));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return products;
    }

    public static void write(List<Product> products) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (Product e :
                    products) {
                bufferedWriter.write(e.write() + "\n");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
