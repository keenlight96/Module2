package Task2_id9172;

public class Cylinder extends Circle {
    double length;

    public Cylinder() {
    }

    public Cylinder(double length, double radius, String color) {
        super(radius, color);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Cylinder with radius = " + radius + ", length = " + length + ", color = " + color;
    }
}
