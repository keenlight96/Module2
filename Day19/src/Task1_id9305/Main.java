package Task1_id9305;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input email: ");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[a-zA-z0-9]+@[a-zA-z0-9]+.[a-zA-z0-9]+");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());
    }
}
