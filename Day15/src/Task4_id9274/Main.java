package Task4_id9274;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st side: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Input 2nd side: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Input 3rd side: ");
        int c = Integer.parseInt(scanner.nextLine());

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("They are 3 sides of a triangle");
        else
            throw new IllegalTriangleException();
    }
}
