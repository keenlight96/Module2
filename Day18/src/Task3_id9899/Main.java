package Task3_id9899;

public class Main {
    public static void main(String[] args) {
        Count count1 = new Count("count1", 10);
        Count count2 = new Count("count2", 20);
        count1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException exception) {
        }
        count2.start();
    }
}
