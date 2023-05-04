import java.util.Scanner;

public class Bai1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Phương trình bậc nhất: " + a + "x + " + b + " = 0");
        if (a == 0) {
            if (b == 0) System.out.println("Phương trình vô số nghiệm.");
            else System.out.println("Phương trình vô nghiệm");
        } else {
            double result = (double) -b/a;
            System.out.println("Phương trình có nghiệm x = " + result);
        }
    }
}
