package Task5_id9309;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input phone number: ");
        String phoneNumber = scanner.nextLine();

        Pattern pattern = Pattern.compile("^\\([0-9]{2}\\)-\\([0][0-9]{9}\\)$");
        Matcher matcher = pattern.matcher(phoneNumber);

        System.out.println(matcher.matches());

    }
}
