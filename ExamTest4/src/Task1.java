import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Result: " + findNextPerfectNumber(n));
    }

    public static int findNextPerfectNumber(int number) {
        while (true) {
            number++;
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    sum += i;
            }
            if (number == sum)
                return number;
        }
    }
}
