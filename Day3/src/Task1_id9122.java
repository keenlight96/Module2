import java.util.Scanner;

public class Task1_id9122 {
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

        for (int i = 0; i < ar.length / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = temp;
        }
        System.out.print("Reversed Array: ");
        for (int j : ar) {
            System.out.print(j + " ");
        }
    }
}
