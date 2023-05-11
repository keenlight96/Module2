package Task1_id9171;

public class Circle extends Shape {
    public double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2) / 4;
    }

    public double getPerimeter() {
        return Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Circle a = new Circle(5, "red", false);
        System.out.println(a.toString());
    }
}
