package Task3_id9899;

public class Count implements Runnable{
    public Thread thread;
    public String name;
    private int number;

    public Count(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 1; i <= number; i++) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
            }
        }
    }

    public void start() {
        thread = new Thread(this);
        thread.start();
    }
}
