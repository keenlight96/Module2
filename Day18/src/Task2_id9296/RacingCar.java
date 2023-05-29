package Task2_id9296;

public class RacingCar implements Runnable {
    private String name;

    public Thread t;
    private int speed;
    private int distance;

    public RacingCar(String name, int speed, int distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void run() {
        String road = "";
        int range = 0;
        try {
            while (range < distance) {
                road = name + " : |";
                for (int i = 1; i <= 20; i++) {
                    if (i < ((Double.parseDouble(String.valueOf(range)) / Double.parseDouble(String.valueOf(distance))) * 20))
                        road += "=";
                    else if (i == ((Double.parseDouble(String.valueOf(range)) / Double.parseDouble(String.valueOf(distance))) * 20))
                        road += "o";
                    else
                        road += "-";
                }
                road += "| " + range;
                System.out.println(road);

                range += speed;
                Thread.sleep(1000);
            }
            System.out.println(name + " finished");
        } catch (InterruptedException exception) {
        }
    }

    public void start() {
        t = new Thread(this, name);
        t.start();
    }
}
