import java.util.Scanner;

public class Task6_id9127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = {5, 9, 2, 8, 9, 10, 4, 9};
        System.out.print("Given array: ");
        for (int j : ar) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.print("Input number: ");
        int num = sc.nextInt();

        int[] newAr = removeValue(ar, num);
        System.out.print("New array: ");
        for (int j : newAr) {
            System.out.print(j + " ");
        }
        System.out.println(newAr);
    }

    public static int[] removeValue(int[] array, int number) {
        int count = 0;
        for (int j : array) {
            if (j != number)
                count++;
        }
        int[] newArray = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArray[count] = array[i];
                count++;
            }
        }
        return newArray;
    }
}
