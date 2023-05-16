package Task4_id9201;

public class Main {
    public static void main(String[] args) {

    }

    public static String classify(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c) > a) {
            if (a == b && a == c) {
                return "Tam giác đều";
            }

            if (a == b || a == c || b == c) {
                return "Tam giác cân";
            }

            return "Tam giác thường";
        }
        return "Không phải tam giác";
    }
}
