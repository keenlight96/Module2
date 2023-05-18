package Task4_id9223;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String textOrigin = "Tôi là Nguyễn Kim Long tôi là người bình thường";
        String text = textOrigin.substring(0);

        HashMap<String, Integer> dictionary = new HashMap<>();
        while (text.contains(" ")) {
            String str = text.substring(0, text.indexOf(" "));
            text = text.substring(text.indexOf(" ") + 1);

            if (dictionary.containsKey(str)) {
                dictionary.put(str, dictionary.get(str) + 1);
            } else {
                dictionary.put(str, 1);
            }
        }

        if (dictionary.containsKey(text)) {
            dictionary.put(text, dictionary.get(text) + 1);
        } else {
            dictionary.put(text, 1);
        }

        System.out.println(dictionary.entrySet());
    }
}
