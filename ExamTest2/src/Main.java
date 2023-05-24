public class Main {
    public static void main(String[] args) {
        Management management = new Management();
        int choice;
        while (true) {
            System.out.println("----- Vaccination Management -----");
            System.out.println("1. Show all customers and vaccinate");
            System.out.println("2. Add a customer");
            System.out.println("3. Vaccinate");
            System.out.println("4. Exit");
            choice = management.inputInteger("");
            switch (choice) {
                case 1:
                    management.show();
                    break;
                case 2:
                    management.add();
                    break;
                case 3:
                    management.vaccinate();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
