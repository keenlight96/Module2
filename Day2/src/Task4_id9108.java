import java.util.Scanner;

public class Task4_id9108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 4; i++) {
                    for (int j = i; j < 4; j++) {
                        System.out.printf(" * ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if ((i == 0) || (i == 4))
                            System.out.printf(" * ");
                        else {
                            if ((j == 0) || (j == 4))
                                System.out.printf(" * ");
                            else
                                System.out.printf("   ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 8; j++) {
                        if ((i == 0) || (i == 4))
                            System.out.printf(" * ");
                        else {
                            if ((j == 0) || (j == 7))
                                System.out.printf(" * ");
                            else
                                System.out.printf("   ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 0:
                break;
            default:
        }

    }
}
