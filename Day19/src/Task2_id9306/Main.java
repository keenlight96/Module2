package Task2_id9306;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input username: ");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[a-z0-9_]{6,}$");
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.matches());

    }
}
