public class Task3_id9162 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println("Radius: " + circle1.getRadius() + "\nArea: " + circle1.getArea());
    }
}
class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2) / 4;
    }
}
