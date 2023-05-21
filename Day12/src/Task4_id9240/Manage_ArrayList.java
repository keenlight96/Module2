package Task4_id9240;

import java.util.*;

public class Manage_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manage_ArrayList list = new Manage_ArrayList();
        while (true) {
            System.out.println("--------------------");
            System.out.println("1. Show");
            System.out.println("2. Add");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Sort by price");
            System.out.println("7. Exit");
            System.out.println("--------------------");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    list.show();
                    break;
                case 2:
                    list.add();
                    break;
                case 3:
                    list.edit();
                    break;
                case 4:
                    list.delete();
                    break;
                case 5:
                    list.search();
                    break;
                case 6:
                    list.sort();
                    break;
                case 7:
                    System.exit(0);
            }
        }

    }
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> management = new ArrayList<>();

    public Manage_ArrayList() {
        management.add(new Product("Milk", 35000));
        management.add(new Product("Beer", 55000));
        management.add(new Product("Alcohol", 100000));
    }

    public void show() {
        for (Product e :
                management) {
            System.out.println(e);
        }
    }

    public void add() {
        System.out.print("Input name and price (<Name> - <Price>): ");
        String input = sc.nextLine();
        String name = input.substring(0, input.indexOf("-")).trim();
        int price = Integer.parseInt(input.substring(input.indexOf("-") + 1).trim());

        management.add(new Product(name, price));
    }

    public void edit() {
        boolean check = false;
        while (!check) {
            System.out.print("Input ID: ");
            int inputID = Integer.parseInt(sc.nextLine());
            for (Product e :
                    management) {
                if (e.getId() == inputID) {
                    System.out.print("Input name and price (<Name> - <Price>): ");
                    String input = sc.nextLine();
                    String name = input.substring(0, input.indexOf("-")).trim();
                    int price = Integer.parseInt(input.substring(input.indexOf("-") + 1).trim());

                    e.setName(name);
                    e.setPrice(price);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.print("ID not found. ");
            }
        }
    }

    public void delete() {
        System.out.print("Input ID: ");
        int inputID = Integer.parseInt(sc.nextLine());
        for (Product e :
                management) {
            if (e.getId() == inputID) {
                management.remove(e);
                break;
            }
        }
    }

    public void search() {
        boolean check = false;
        System.out.print("Input product name: ");
        String input = sc.nextLine();
        for (Product e :
                management) {
            if (e.getName().equals(input)) {
                System.out.println(e);
                check = true;
            }
        }

        if (!check) {
            System.out.println("ID not found");
        }
    }

    public void sort() {
        System.out.println("1. Increase");
        System.out.println("2. Decrease");
        int input = Integer.parseInt(sc.nextLine());
        switch (input) {
            case 1:
                Collections.sort(management, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getPrice() - o2.getPrice();
                    }
                });
                break;
            case 2:
                Collections.sort(management, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o2.getPrice() - o1.getPrice();
                    }
                });
                break;
            default:
                System.out.println("Wrong input");
        }

    }




}
