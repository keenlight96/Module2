package Task9_id9227;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
            queue.add(text.charAt(i));
        }

        boolean check = true;
        for (int i = 0; i < text.length(); i++) {
            if (stack.pop() != queue.remove()) {
                check = false;
                break;
            }
        }

        if (check)
            System.out.println("Text is palindrome");
        else
            System.out.println("Text is not palindrome");
    }
}
