import java.util.Scanner;

public class Bai1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year = sc.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) System.out.println("Năm " + year + " là năm nhuận");
            else System.out.println("Năm " + year + " không phải năm nhuận");
        } else {
            if (year % 4 == 0) System.out.println("Năm " + year + " là năm nhuận");
            else System.out.println("Năm " + year + " không phải năm nhuận");
        }
    }
}
