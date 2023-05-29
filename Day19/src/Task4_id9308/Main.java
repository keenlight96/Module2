package Task4_id9308;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input class name: ");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[ACP][0-9]{4}[GHIK]");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());
    }
}
