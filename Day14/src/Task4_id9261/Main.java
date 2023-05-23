package Task4_id9261;

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

        insertionSort(ar);
        show(ar);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                System.out.print("i = " + i+ ", j = " + j+ " , temp = " + temp + " : " );
                show(array);
                System.out.println();
                if (temp < array[j])
                    array[j + 1] = array[j];
                else
                    break;
            }
            array[j + 1] = temp;
            System.out.print("i = " + i+ ", j = " + j+ " , temp = " + temp + " : " );
            show(array);
            System.out.println();
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
