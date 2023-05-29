package Task4_id9297;

public class NumberGenerator implements Runnable{
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " : " + i + "  ---  " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
            }
        }
    }

}
