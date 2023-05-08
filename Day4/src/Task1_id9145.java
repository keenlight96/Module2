import java.util.Scanner;

public class Task1_id9145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Input width: ");
        rect.width = sc.nextFloat();
        System.out.print("Input height: ");
        rect.height = sc.nextFloat();

        rect.display();
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }


}
class Rectangle {
    float width, height;

    public Rectangle() {
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getArea() {
        return this.width * this.height;
    }

    public float getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public void display() {
        System.out.println("Width = " + this.width);
        System.out.println("Height = " + this.height);
    }
}
