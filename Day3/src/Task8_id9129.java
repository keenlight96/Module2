import java.util.Scanner;

public class Task8_id9129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array1 length: ");
        int n = sc.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < ar1.length; i++) {
            System.out.print("Input element " + i + ": ");
            ar1[i] = sc.nextInt();
        }
        System.out.print("Input array2 length: ");
        n = sc.nextInt();
        int[] ar2 = new int[n];
        for (int i = 0; i < ar2.length; i++) {
            System.out.print("Input element " + i + ": ");
            ar2[i] = sc.nextInt();
        }
        //
        int[] ar3 = addArray(ar1, ar2);
        System.out.print("New array: ");
        for (int j : ar3) {
            System.out.print(j + " ");
        }
    }

    public static int[] addArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        int count = 0;
        for (int j : array1) {
            array3[count] = j;
            count++;
        }
        for (int j : array2) {
            array3[count] = j;
            count++;
        }
        return array3;
    }
}
