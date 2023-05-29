import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text 1: ");
        String string1 = scanner.nextLine();
        System.out.print("Input text 2: ");
        String string2 = scanner.nextLine();

        System.out.println(checkAnagram(string1, string2));

    }

    public static boolean checkAnagram(String string1, String string2) {
        Set<Character> characters1 = new HashSet<>();
        Set<Character> characters2 = new HashSet<>();
        for (int i = 0; i < string1.length(); i++) {
            characters1.add(string1.charAt(i));
        }
        for (int i = 0; i < string2.length(); i++) {
            characters2.add(string2.charAt(i));
        }

        for (int i = 0; i < string2.length(); i++) {
            if (!characters1.contains(string2.charAt(i))) {
                return false;
            }
        }
        for (int i = 0; i < string1.length(); i++) {
            if (!characters2.contains(string1.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
