import java.util.Scanner;

public class Task7_id9128 {
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

        //
        System.out.print("Input add number: ");
        int num = sc.nextInt();
        System.out.print("Input index to add: ");
        int idx = sc.nextInt();
        //

        int[] newAr = new int[n+1];
        for (int i = 0; i < newAr.length; i++) {
            if (i < idx)
                newAr[i] = ar[i];
            else if (i == idx)
                newAr[i] = num;
            else
                newAr[i] = ar[i-1];
        }

        System.out.print("New array: ");
        for (int j : newAr) {
            System.out.print(j + " ");
        }
    }
}
