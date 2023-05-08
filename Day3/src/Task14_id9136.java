import java.util.Scanner;

public class Task14_id9136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();
        System.out.print("Input character: ");
        char character = sc.next().charAt(0);

        int count = countOccurrences(text, character);
        System.out.println("The time occurrence is " + count);
    }

    public static int countOccurrences(String text, char character) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character)
                count++;
        }
        return count;
    }
}
