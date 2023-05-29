package Task2_id9900;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + "  " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
            }
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
        }
        t.start();
    }
}
