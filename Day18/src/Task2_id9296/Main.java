package Task2_id9296;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        RacingCar car1 = new RacingCar("Car1", 10, 100);
        RacingCar car2 = new RacingCar("Car2", 20, 100);
        RacingCar car3 = new RacingCar("Car3", 15, 100);

        try {
            car1.start();
            Thread.sleep(50);
            car2.start();
            Thread.sleep(50);
            car3.start();
        } catch (InterruptedException exception) {
        }
    }
}


