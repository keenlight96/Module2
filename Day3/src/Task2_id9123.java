import java.util.Scanner;

public class Task2_id9123 {
    public static void main(String[] args) {
        // List of given names
        String[] ar = {"Duyên", "Long", "Hoàng"};
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = sc.nextLine();

        boolean chk = false;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].equals(name)) {
                System.out.println("Found at " + i);
                chk = true;
            }
        }
        if (!chk)
            System.out.println("Not found");

    }
}
