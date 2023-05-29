package Task6_id9299;

public class OptimizedPrimeFactorization extends Thread {
    @Override
    public void run() {
        for (int i = 2; i < 10000; i++) {
            if (optimizedCheckPrime(i))
                System.out.println("Optimized : " + i);
        }
    }

    public boolean optimizedCheckPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % 2 == 0)
                return false;
        }
        return true;
    }
}
