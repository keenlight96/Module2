import java.util.Scanner;

public class Task10_id9131 {
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

        int min = minValue(ar);
        System.out.println("Min value of the array is " + min);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min)
                min = i;
        }
        return min;
    }
}
