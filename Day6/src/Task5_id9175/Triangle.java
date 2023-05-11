package Task5_id9175;

import Task1_id9171.Shape;

public class Triangle extends Shape {
    double side1 = 1;
    double side2 = 1;
    double side3 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        return Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - side1) *
                (getPerimeter() / 2 - side2) + (getPerimeter() / 2 - side3));
    }

    @Override
    public String toString() {
        return "Triangle with 3 sides are " + side1 + ", " + side2 + ", " + side3;
    }
}
