import java.util.Scanner;

public class Task9_id9130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Input number of columns: ");
        int column = sc.nextInt();
        int[][] arr = new int[rows][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Input element arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for (int[] i : arr) {
            for (int j : i) {
                if (j > max)
                    max = j;
            }
        }

        System.out.print("Max value of array is " + max);
    }
}
