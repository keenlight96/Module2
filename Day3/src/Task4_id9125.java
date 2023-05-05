import java.util.Scanner;

public class Task4_id9125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        byte choice = sc.nextByte();
        switch (choice) {
            case 1:
                System.out.print("Input degree C: ");
                float degree = sc.nextFloat();
                System.out.println("It is equal to " + cToF(degree) + " degree F");
                break;
            case 2:
                System.out.print("Input degree F: ");
                degree = sc.nextFloat();
                System.out.println("It is equal to " + fToC(degree) + " degree C");
                break;
        }
    }

    public static float cToF(float c) {
        return (c * 9 / 5 + 32);
    }

    public static float fToC(float f) {
        return (f - 32) * 5 / 9;
    }
}
