package Task2_id9276;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ar = createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input index: ");
        int index = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println(ar[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }

        System.out.println("End.");
    }

    public static int[] createRandom() {
        Random random = new Random();
        int[] ar = new int[100];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(100);
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        return ar;
    }
}
