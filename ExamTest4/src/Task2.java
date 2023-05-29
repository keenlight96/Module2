public class Task2 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(144));
    }

    public static boolean isPerfectSquare(long number) {
        double temp = Double.parseDouble(String.valueOf(number));
        if (Math.sqrt(temp) % 1 == 0.0)
            return true;
        return false;
    }
}
