package Task6_id9299;

public class LazyPrimeFactorization extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (lazyCheckPrime(i))
                System.out.println("Lazy : " + i);
        }
    }

    public boolean lazyCheckPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
