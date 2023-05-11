package Task3_id9173;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point2D obj1 = new Point2D(3,5);
        Point3D obj2 = new Point3D(5,7,10);
        System.out.println(obj1);
        obj2.setXYZ(10,20,30);
        System.out.println(obj2.getXYZ()[1]);
        System.out.println(obj2);
    }
}
