import java.util.Scanner;

public class Task3_id9124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Input element " + i + ": ");
            ar[i] = sc.nextInt();
        }

        System.out.print("Created Array: ");
        for (int j : ar) {
            System.out.print(j + " ");
        }
        System.out.println();

        int max = ar[0];
        byte idx = 0;
        for (byte i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                idx = i;
            }
        }

        System.out.print("The highest value is " + max + " at position " + idx);
    }
}
