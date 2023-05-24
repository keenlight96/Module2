import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Management {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    ArrayList<Customer> customers = new ArrayList<>();

    {
        customers.add(new Customer("Long", "01321654"));
        customers.add(new Customer("Hoàng", "06572654"));
    }

    public String inputString(String input) {
        while (true) {
            try {
                System.out.print("Input " + input + ": ");
                return scanner.nextLine();
            } catch (Exception e) {
                // conditions go here if needed
            }
        }
    }

    public Date inputDate(String input) {
        while (true) {
            try {
                System.out.print("Input " + input + " (dd/MM/yyyy): ");
                return dateFormat.parse(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Wrong format input");
            }
        }
    }

    public double inputDouble(String input) {
        while (true) {
            try {
                System.out.print("Input " + input + ": ");
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Wrong format input");
            }
        }
    }

    public int inputInteger(String input) {
        while (true) {
            try {
                System.out.print("Input " + input + ": ");
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Wrong format input");
            }
        }
    }

    public void show() {
        for (Customer e :
                customers) {
            System.out.println(e);
        }
        int choice;
        while (true) {
            boolean check = false;
            choice = inputInteger("ID");
            for (Customer e :
                    customers) {
                if (e.getId() == choice) {
                    e.showVaccineList();
                    check = true;
                }
            }

            if (check) {
                scanner.nextLine();
                break;
            } else
                System.out.println("ID not found");
        }

    }

    public void add() {
        customers.add(new Customer(inputString("name"), inputString("phone")));
    }

    public void vaccinate() {
        String name;
        while (true) {
            boolean check = false;
            name = inputString("customer name");
            for (Customer e :
                    customers) {
                if (e.getName().equals(name)) {
                    check = true;
                    e.vaccinate(new Vaccine(e.getIdVaccine(), inputString("vaccine name"), inputDate("manufactured date"),
                            inputDouble("price"), inputDate("injection date")));
                }
            }

            if (check) {
                System.out.println("Customer has been vaccinated");
                break;
            } else
                System.out.println("Customer not found");
        }

    }

}
