package Task10_id9228;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input equation: ");
        String text = sc.nextLine();

        boolean check = true;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == "(".charAt(0)) {
                stack.push(1);
            }
            if (text.charAt(i) == ")".charAt(0)) {
                try {
                    stack.pop();
                } catch (Exception e){
                    check = false;
                }
            }
        }
        try {
            stack.pop();
            check = false;
        } catch (Exception e){}

        if (check) {
            System.out.println("Good equation");
        } else
            System.out.println("Error equation");
    }
}
