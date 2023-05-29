import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String text = "log1llfa2,5";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        matcher.find(0);
        System.out.println(matcher.start() + " - " + matcher.end());
        String[] ar = text.split(",");
        for (String e :
                ar) {
            System.out.println(e);
        }
    }
}
