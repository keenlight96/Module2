import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    public List<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    {
        loadData();
    }

    public Management() {
    }

    public String inputString(String input) {
        while (true) {
            try {
                System.out.print("Input " + input + ": ");
                return scanner.nextLine();
            } catch (Exception exception) {
                System.out.println("Wrong input format.");
            }
        }
    }

    public int inputInteger(String input) {
        while (true) {
            try {
                System.out.print("Input " + input + ": ");
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception exception) {
                System.out.println("Wrong input format.");
            }
        }
    }

    public void show() {
        for (Employee e :
                employees) {
            System.out.println(e);
        }
        scanner.nextLine();
    }

    public void add() {
        int choice = 4;
        while (choice != 0) {
            System.out.println("1. Administrative Employee");
            System.out.println("2. Technical Employee");
            System.out.println("3. Sales Employee");
            System.out.println("0. Back");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception exception) {
                System.out.println("Wrong input format.");
            }
            switch (choice) {
                case 1:
                    employees.add(new AdministrativeEmployee(inputString("name"), inputInteger("age"),
                            inputInteger("days"), inputInteger("days off")));
                    break;
                case 2:
                    employees.add(new TechnicalEmployee(inputString("name"), inputInteger("age"),
                            inputInteger("days"), inputInteger("projects")));
                    break;
                case 3:
                    employees.add(new SalesEmployee(inputString("name"), inputInteger("age"),
                            inputInteger("days"), inputInteger("sales")));
                    break;
            }
        }
        saveData();
    }

    public void update() {
        int id = inputInteger("ID");
        for (Employee e :
                employees) {
            if (id == e.getId()) {
                System.out.println(e);
                e.setName(inputString("name"));
                e.setAge(inputInteger("age"));
                e.setDays(inputInteger("days"));
                if (e instanceof AdministrativeEmployee) {
                    ((AdministrativeEmployee) e).setDaysOff(inputInteger("days off"));
                } else if (e instanceof TechnicalEmployee) {
                    ((TechnicalEmployee) e).setProjects(inputInteger("projects"));
                } else if (e instanceof SalesEmployee) {
                    ((SalesEmployee) e).setSales(inputInteger("sales"));
                }
                saveData();
                return;
            }
        }

        System.out.println("ID not found");
    }

    public void delete() {
        int id = inputInteger("ID");
        for (Employee e :
                employees) {
            if (id == e.getId()) {
                employees.remove(e);
                saveData();
                return;
            }
        }
        System.out.println("ID not found");
    }

    public void calculateSalary() {
        for (Employee e :
                employees) {
            e.calculateMonthlySalary();
        }
        saveData();
    }

    public void toCheck() {
        int id;
        System.out.println("Hint: Input 0 to back");
        while (true) {
            id = inputInteger("ID to check");
            if (id == 0) {
                saveData();
                return;
            }
            for (Employee e :
                    employees) {
                if (id == e.getId()) {
                    e.setDays(e.getDays() + 1);
                    System.out.println("Thank you " + e.getName());
                }
            }
        }
    }


    public void saveData() {
        File file = new File("src/data/data.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {
            outputStream.writeObject(employees);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void loadData() {
        File file = new File("src/data/data.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            employees = (List<Employee>) objectInputStream.readObject();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
