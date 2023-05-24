package Task3_id9278;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Input y: ");
        int y = Integer.parseInt(scanner.nextLine());

        calculation(x, y);
    }

    public static void calculation(int x, int y) {
        try {
            System.out.println("Addition: " + (x + y));
            System.out.println("Subtraction: " + (x - y));
            System.out.println("Multiplication: " + (x * y));
            System.out.println("Division: " + (x / y));
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }

    }
}
