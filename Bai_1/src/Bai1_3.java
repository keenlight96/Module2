import java.util.Scanner;

public class Bai1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int length = sc.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int width = sc.nextInt();
        int area = length * width;
        System.out.println("Diện tích: " + area);
    }
}
