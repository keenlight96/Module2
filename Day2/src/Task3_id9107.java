import java.util.Scanner;

public class Task3_id9107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input a: ");
        int a = sc.nextInt();
        System.out.printf("Input b: ");
        int b = sc.nextInt();

        int min, ucln = 1;
        if (a < b)
            min = a;
        else
            min = b;

        for (int i = min; i > 1 ; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                ucln = i;
                break;
            }
        }

        System.out.println("Ước chung lớn nhất: " + ucln);
    }
}
