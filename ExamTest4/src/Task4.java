import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String string = scanner.nextLine();
        System.out.println(findMaxIteratingSubString(string));
    }

    public static String findMaxIteratingSubString(String string) {
        String subString = "";
        String maxString = "";
        for (int i = 0; i < string.length() / 2; i++) {
            for (int j = 1; j < string.length() / 2+1; j++) {
                subString = findIteratingSubString(string, string.substring(i,i+j));
                if (subString.length() > maxString.length())
                    maxString = subString;
            }
        }
        return maxString;
    }

    public static String findIteratingSubString(String string, String subString) {
        String tempString = "";
        int count = 0;
        for (int i = 0; i < string.length() - subString.length()+1; i++) {
            if (!string.contains(subString))
                break;
            if (subString.equals(string.substring(i, i + subString.length()))) {
                count++;
                tempString += subString;
                i = i + subString.length() - 1;
            }
        }
        if (count == 1) {
            return "";
        }
        return tempString;
    }
}
