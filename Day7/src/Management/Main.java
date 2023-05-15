package Management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Management management = new Management();
        while (true){
            System.out.println("------------------------");
            System.out.println("1. Show all employees");
            System.out.println("2. Add an employee");
            System.out.println("3. Calculate salary of all employees");
            System.out.println("4. Delete an employee");
            System.out.println("5. Edit an employee");
            System.out.println("6. Search an employee");
            System.out.println("7. Sort employees by age");
            System.out.println("8. Exit");
            System.out.println("------------------------");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    management.show();
                    break;
                case 2:
                    management.add();
                    break;
                case 3:
                    management.cal();
                    break;
                case 4:
                    management.del();
                    break;
                case 5:
                    management.edit();
                    break;
                case 6:
                    management.search();
                    break;
                case 7:
                    management.sort();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
