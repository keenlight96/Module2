import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String string = scanner.nextLine();
        System.out.println(findMaxDuplicateSubString(string));
    }

    public static String findMaxDuplicateSubString(String string) {
        String subString = "";
        String maxString = "";
        int max = 0;
        int count = 0;
        for (int i = 0; i < string.length() / 2; i++) {
            for (int j = 2; j < string.length() / 2 + 1; j++) {
                subString = string.substring(i, i + j);
                count = findDuplicateSubString(string, subString);
                if (count > max) {
                    max = count;
                    maxString = subString;
                }
            }
        }
        return maxString;
    }

    public static int findDuplicateSubString(String string, String subString) {
        int count = 0;
        for (int i = 0; i < string.length() - subString.length() + 1; i++) {
            if (!string.contains(subString))
                break;
            if (subString.equals(string.substring(i, i + subString.length()))) {
                count++;
                i = i + subString.length() - 1;
            }
        }
        return count;
    }
}
