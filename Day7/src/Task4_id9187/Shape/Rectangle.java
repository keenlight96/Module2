package Task4_id9187.Shape;

public class Rectangle extends Shape implements Resizable {
    double width, length;

    public Rectangle() {
        width = 1;
        length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public void resize(double percent) {
        setLength(getLength() * percent / 100);
        setWidth(getWidth() * percent / 100);
    }

    @Override
    public String toString() {
        return "A rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle("blue", true, 3, 5);
        System.out.println(obj.toString());
    }
}
