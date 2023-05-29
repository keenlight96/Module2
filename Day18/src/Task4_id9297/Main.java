package Task4_id9297;

public class Main {
    public static void main(String[] args) {
        NumberGenerator c1 = new NumberGenerator("Count1");
        NumberGenerator c2 = new NumberGenerator("Count2");

        Thread cc1 = new Thread(c1);
        Thread cc2 = new Thread(c2);

        cc1.setPriority(Thread.MAX_PRIORITY);
        cc2.setPriority(Thread.MIN_PRIORITY);

        cc1.start();
        cc2.start();
    }
}
