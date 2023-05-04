import java.util.Scanner;

public class Bai1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao: ");
        float height = sc.nextFloat();
        System.out.println("Nhập cân nặng: ");
        float weight = sc.nextFloat();
        float bmi = (float) (weight / Math.pow(height, 2));
        System.out.println("BMI = " + bmi);
        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Bình thường");
        } else if (bmi < 30) {
            System.out.println("Thừa cân");
        } else System.out.println("Béo phì");
    }
}
