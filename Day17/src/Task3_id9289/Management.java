package Task3_id9289;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Management {
    Scanner scanner = new Scanner(System.in);
    List<Product> list = FileReadWrite.read();

    public Management() {
//        list.add(new Product("M1", "Milk type 1", 251000, 32, "Imported milk"));
//        list.add(new Product("A1", "Táo mèo", 35000, 83, "Domestic alcohol"));
//        list.add(new Product("A2", "Whiskey", 1475000, 73, "Imported alcohol"));
//        list.add(new Product("B1", "Tiger Beer", 15000, 302, "Domestic beer"));
//        list.add(new Product("B2", "Hanoi Beer", 10000, 331, "Domestic beer"));
//        list.add(new Product("A3", "Drum", 2050000, 15, "Imported alcohol"));
//        list.add(new Product("A4", "Chivas", 4320000, 17, "Imported alcohol"));
//        list.add(new Product("M2", "Milk type 2", 171000, 25, "Imported milk"));
    }

    public void show() {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            list.get(i).printf();
            count++;
            if (count % 5 == 0 || i == list.size() - 1)
                scanner.nextLine();
        }
    }

    public void add() {
        while (true) {
            try {
                System.out.print("Input ID: ");
                String id = scanner.nextLine();
                System.out.print("Input name: ");
                String name = scanner.nextLine();
                System.out.print("Input price: ");
                int price = Integer.parseInt(scanner.nextLine());
                System.out.print("Input quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                System.out.print("Input description: ");
                String description = scanner.nextLine();

                list.add(new Product(id, name, price, quantity, description));
                System.out.println("Product added");
                break;
            } catch (Exception e) {
                System.out.println("Wrong type input");
            }
        }
        FileReadWrite.write(list);
    }

    public void update() {
        System.out.print("Input ID: ");
        String id = scanner.nextLine();
        boolean check = false;
        for (Product e :
                list) {
            if (e.getId().equals(id)) {
                check = true;
                while (true) {
                    try {
                        System.out.print("Input name: ");
                        String name = scanner.nextLine();
                        System.out.print("Input price: ");
                        int price = Integer.parseInt(scanner.nextLine());
                        System.out.print("Input quantity: ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        System.out.print("Input description: ");
                        String description = scanner.nextLine();

                        e.setName(name);
                        e.setPrice(price);
                        e.setQuantity(quantity);
                        e.setDescription(description);
                        System.out.println("Product added");
                        break;
                    } catch (Exception exception) {
                        System.out.println("Wrong type input");
                    }
                }
                break;
            }
        }

        if (!check)
            System.out.println("ID not found");

        FileReadWrite.write(list);
    }

    public void delete() {
        while (true) {
            System.out.println("Input ID: ");
            String id = scanner.nextLine();
            if (id.equals(""))
                return;
            boolean check = false;

            for (Product e :
                    list) {
                if (e.getId().equals(id)) {
                    check = true;
                    System.out.print("Confirm (Y): ");
                    String confirm = scanner.nextLine();
                    if (confirm.equalsIgnoreCase("y"))
                        list.remove(e);
                    break;
                }
            }

            if (!check)
                System.out.println("ID not found");
            else
                break;
        }
        FileReadWrite.write(list);
    }

    public void sortByPrice() {
        int choice = 0;
        while (choice != 3) {
            System.out.println("----- SORT BY PRICE -----");
            System.out.println("1. Increase");
            System.out.println("2. Decrease");
            System.out.println("3. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Collections.sort(list, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return o1.getPrice() - o2.getPrice();
                        }
                    });
                    show();
                    break;
                case 2:
                    Collections.sort(list, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return o2.getPrice() - o1.getPrice();
                        }
                    });
                    show();
                    break;
            }
        }
        FileReadWrite.write(list);
    }

    public void findHighestPrice() {
        int max = list.get(0).getPrice();
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getPrice() > max) {
                max = list.get(i).getPrice();
                index = i;
            }
        }

        list.get(index).printf();
    }
}
