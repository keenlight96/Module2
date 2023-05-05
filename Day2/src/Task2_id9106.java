import java.util.Locale;
import java.util.Scanner;

public class Task2_id9106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input Money Spend: ");
        long money = sc.nextLong();
        System.out.printf("Input Months of Term Deposit: ");
        byte months = sc.nextByte();
        System.out.printf("Input Annual Interest Rate (%%): ");
        float interestRate = sc.nextFloat();

        for (int i = 0; i < months; i++) {
            money += money * interestRate / 100 / 12;
        }

        System.out.printf(Locale.US, "Money to withdraw after term deposit: %,d", money);
    }
}
