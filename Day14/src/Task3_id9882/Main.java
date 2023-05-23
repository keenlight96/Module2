package Task3_id9882;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Input array: ");
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        selectionSort(ar);
        show(ar);
    }

    public static void selectionSort(int[] array) {
        int min;
        int index;
        for (int i = 0; i < array.length - 1; i++) {
            min = array[i];
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }

            if (array[i] != min) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }

        }
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
