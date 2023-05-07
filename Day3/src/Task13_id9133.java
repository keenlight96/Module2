import java.util.Scanner;

public class Task13_id9133 {
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

        System.out.println("Sum of main diagonal line of the array is " + sumOfMainDiagonal(arr));
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

    public static float sumOfMainDiagonal(float[][] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
