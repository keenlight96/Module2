package Task8_id9226;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input decimal number: ");
        int number = Integer.parseInt(sc.nextLine());

        Stack<Integer> stacks = new Stack<>();
        while (number != 0) {
            stacks.push(number % 2);
            number = Math.floorDiv(number, 2);
        }
        System.out.print("Binary number: ");
        int size = stacks.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stacks.pop());
        }
    }
}
