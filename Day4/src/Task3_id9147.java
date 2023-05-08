import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

public class Task3_id9147 {
    public static void main(String[] args) {
        StopWatch clock = new StopWatch();
        clock.start();
        int[] ar = new int[100000];
        for (int i : ar) {
            i = (int) (Math.random() * 1000000);
        }

//        for (int i = 0; i < ar.length - 1; i++) {
//            for (int j = i + 1; j < ar.length; j++) {
//                if (ar[i] > ar[j]) {
//                    int temp = ar[i];
//                    ar[i] = ar[j];
//                    ar[j] = temp;
//                }
//            }
//        }
        Arrays.sort(ar);
        clock.end();

        System.out.println(clock.getElapsedTime());
    }
}

class StopWatch {
    private LocalTime startTime, endTime;

    private LocalTime getStartTime() {
        return this.startTime;
    }

    private LocalTime getEndTime() {
        return this.endTime;
    }

    public StopWatch() {
        this.startTime = LocalTime.now();
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void end() {
        this.endTime = LocalTime.now();
    }

    public long getElapsedTime() {
        Duration duration = Duration.between(this.startTime, this.endTime);
        return duration.toMillis();
    }


}
