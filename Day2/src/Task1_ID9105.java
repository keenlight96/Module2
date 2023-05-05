import java.util.Scanner;

public class Task1_ID9105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number: ");
        int num = sc.nextInt();

        boolean chk;
        if (num < 2) chk = false;
        else {
            chk = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    chk = false;
                    break;
                }
            }

            if (chk)
                System.out.println("Đó là số nguyên tố");
            else
                System.out.println("Đó không phải là số nguyên tố");
        }
    }
}
