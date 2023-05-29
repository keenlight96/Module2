import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = scanner.nextLine();

        System.out.println(findMaxString(text));
    }

    public static String findMaxString(String string) {
        String subString = "";
        int max = 0;
        String maxString = "";
        for (int i = 0; i < string.length() - 1; i++) {
            for (int j = i + 1; j < string.length(); j++) {
                subString = string.substring(i,j);
                if (checkUnique(subString)) {
                    if (subString.length() > max){
                        max = subString.length();
                        maxString = subString;
                    }
                }
            }
        }
        return maxString;
    }

    public static boolean checkUnique(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < i - 1; j++) {
                if (string.charAt(i) == string.charAt(j))
                    return false;
            }
        }
        return true;
    }
}
