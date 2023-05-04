import java.util.Scanner;

public class Bai1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input USD: ");
        float usd = sc.nextFloat();
        int exchangeRate = 23500;
        float vnd = usd * exchangeRate;
        System.out.println(usd + " USD is equal to " + vnd + " VND");
    }
}
