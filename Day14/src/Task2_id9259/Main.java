package Task2_id9259;

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

        bubbleSortByStep(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void bubbleSortByStep(int[] array) {
        boolean isSorted = false;
        for (int i = 0; i < array.length - 1 && !isSorted; i++) {
            isSorted = true;
            for (int j = array.length - 1; j > i; j--) {
                System.out.print("i = " + i + ", j = " + j + " : ");
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                    isSorted = false;
                }
                show(array);
                System.out.println();
            }
        }
        System.out.println(isSorted);
    }

    public static void show(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.print(array[i] + ", ");
            else
                System.out.print(array[i]);
        }
        System.out.print("]");
    }
}
