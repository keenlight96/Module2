package Task3_id9254;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();

        int[] frequentChar = new int[255];

        for (int i = 0; i < text.length(); i++) {
            frequentChar[(int) text.charAt(i)]++;
        }

        int max = 0;
        char character = (char) 0;
        for (int i = 0; i < frequentChar.length; i++) {
            if (frequentChar[i] > max) {
                max = frequentChar[i];
                character = (char) i;
            }
        }

        System.out.println(character + ": " + max + " times");
    }
}
