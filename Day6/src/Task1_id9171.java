public class Task1_id9171 {
    public static void main(String[] args) {

    }
}

class Shape {
    String color;
    boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        if (filled)
            return "A shape with color of " + color + " and filled.";
        return "A shape with color of " + color + " and not filled.";
    }
}

class Circle extends Shape {
    double radius;

    public Circle() {
        radius = 1.0;
    }

}
