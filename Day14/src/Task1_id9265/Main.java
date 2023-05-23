package Task1_id9265;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Input array of numbers:");
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        bubbleSort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        for (int i = 0; i < array.length - 1 && !isSorted; i++) {
            isSorted = true;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                    isSorted = false;
                }
            }
        }
        System.out.println(isSorted);
    }
}
