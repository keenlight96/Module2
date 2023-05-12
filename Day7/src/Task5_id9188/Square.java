package Task5_id9188;

import Task4_id9187.Shape.Rectangle;
import Task4_id9187.Shape.Resizable;

public class Square extends Rectangle implements Resizable,Colorable {
    public Square() {
        width = 1;
        length = 1;
    }

    public Square(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setLength(double side) {
        width = side;
        length = side;
    }

    @Override
    public void resize(double percent) {
        setLength(getLength() * percent / 100);
        setWidth(getWidth() * percent / 100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "A square with side = " + width + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Square obj = new Square(5);
        System.out.println(obj.toString());
    }
}
