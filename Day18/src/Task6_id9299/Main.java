package Task6_id9299;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new LazyPrimeFactorization();
        Thread thread2 = new OptimizedPrimeFactorization();

        thread1.start();
        thread2.start();
    }
}
