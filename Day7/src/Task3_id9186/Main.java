package Task3_id9186;

import Task3_id9186.Shape.Circle;
import Task3_id9186.Shape.CircleComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle(5);
        circles[1] = new Circle(10);
        circles[2] = new Circle(1);
        circles[3] = new Circle(3);

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        for (Circle c :
                circles) {
            System.out.println(c);
        }
    }
}
