import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentsManagement management = new StudentsManagement();

        while (true) {
            System.out.println("1. Show all students");
            System.out.println("2. Add a student");
            System.out.println("3. Adjust a student");
            System.out.println("4. Remove a student");
            System.out.println("5. Find a student");
            System.out.println("6. Sort");
            System.out.println("7. Exit");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    management.show();
                    break;
                case 2:
                    management.add();
                    break;
                case 3:
                    management.adjust();
                    break;
                case 4:
                    management.remove();
                    break;
                case 5:
                    management.find();
                    break;
                case 6:
                    management.sort();
                    break;
                case 7:
                    System.exit(0);
                    break;

            }
        }

    }
}
