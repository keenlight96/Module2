package Task5_id9188;

import Task4_id9187.Shape.Circle;
import Task4_id9187.Shape.Rectangle;
import Task4_id9187.Shape.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(15,20);
        shapes[1] = new Circle(25);
        shapes[2] = new Square(10);
        for (Shape s :
                shapes) {
            if (s instanceof Square) {
                System.out.println(((Square) s).getArea());
                ((Square) s).howToColor();
            }
        }
    }
}
