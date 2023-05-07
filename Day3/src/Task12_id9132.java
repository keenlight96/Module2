import java.util.Scanner;

public class Task12_id9132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Input number of columns: ");
        int columns = sc.nextInt();

        float[][] arr = random2DFloatArray(rows, columns, 100);
        for (float[] floats : arr) {
            for (float floats2 : floats) {
                System.out.printf("%.2f ", floats2);
            }
            System.out.println();
        }

        int chosenColumn;
        do {
            System.out.print("Input row number wanted to sum up: ");
            chosenColumn = sc.nextInt();
            if (chosenColumn > columns) {
                System.out.println("Wrong input");
            }
        } while (chosenColumn > columns);

        System.out.println("Sum of column " + chosenColumn + " is " + sumOfAColumn(arr, chosenColumn));
    }

    public static float[][] random2DFloatArray(int rows, int columns, int rangeEnd) {
        float[][] array = new float[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (float) (Math.random() * rangeEnd);
            }
        }
        return array;
    }

    public static float sumOfAColumn(float[][] array, int column) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == column) {
                    sum += array[i][j];
                }
            }

        }
        return sum;
    }
}
