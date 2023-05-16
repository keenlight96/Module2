package Task5_id9202;

public class Main {
    public static void main(String[] args) {

    }

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        else
            return (String.valueOf(number));
    }
}
