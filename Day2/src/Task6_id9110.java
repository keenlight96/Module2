import java.util.Scanner;

public class Task6_id9110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number: ");
        short num = sc.nextShort();
        short count = 0;
        int runVar = 2;

        while (count < num) {
            boolean chk = true;
            for (int i = 2; i <= Math.sqrt(runVar); i++) {
                if (runVar % i == 0) {
                    chk = false;
                    break;
                }
            }
            if (chk) {
                System.out.printf(runVar + " ");
                count++;
            }
            runVar++;

        }
    }
}
