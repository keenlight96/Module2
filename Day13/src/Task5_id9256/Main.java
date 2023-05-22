package Task5_id9256;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = sc.nextLine();

        System.out.println(getMaxIncreasingString(text));

    }

    public static String getMaxIncreasingString(String text) {
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < text.length() - 1; i++) {
            LinkedList<Character> listTemp = new LinkedList<>();
            listTemp.add(text.charAt(i));
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(j) > listTemp.getLast()) {
                    listTemp.add(text.charAt(j));
                }
            }

            if (listTemp.size() > list.size())
                list = listTemp;
        }

        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        return result;
    }
}

