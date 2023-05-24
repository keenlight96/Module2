import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        while (true) {
            System.out.println("----- PRODUCT MANAGEMENT -----");
            System.out.println("1. Show");
            System.out.println("2. Add");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Sort by price");
            System.out.println("6. Find highest price");
            System.out.println("7. Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    management.show();
                    break;
                case 2:
                    management.add();
                    break;
                case 3:
                    management.update();
                    break;
                case 4:
                    management.delete();
                    break;
                case 5:
                    management.sortByPrice();
                    break;
                case 6:
                    management.findHighestPrice();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
