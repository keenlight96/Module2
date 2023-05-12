package Task2_id9185;

import Task2_id9185.Shape.ComparableCircle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(3.0);
        circles[1] = new ComparableCircle(2.0);
        circles[2] = new ComparableCircle(3.0,"red", true);
        circles[3] = new ComparableCircle(7.0);

        Arrays.sort(circles);

        for (ComparableCircle c :
                circles) {
            System.out.println(c);
        }
    }
}
