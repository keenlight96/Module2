import java.util.Scanner;

public class Task11_id9134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar;
        ar = input1DArray(30);
        System.out.println("Number of students who have passed is " + countPassedStudents(ar, 5));
    }

    public static int[] input1DArray(int length) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Input array length: ");
            n = sc.nextInt();
            if (n > length) {
                System.out.println("Wrong input. Max array length is " + length);
            }
        } while (n > length);

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input element " + i + ": ");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static int countPassedStudents(int[] array, int passingScore) {
        int count = 0;
        for (int i : array) {
            if (i >= passingScore)
                count++;
        }
        return count;
    }
}
