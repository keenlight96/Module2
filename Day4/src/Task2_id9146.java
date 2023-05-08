import java.util.Scanner;

public class Task2_id9146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input c: ");
        double c = sc.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a, b, c);

        System.out.println(pt.a+"x^2 + "+pt.b+"x + "+c+" = 0");
        System.out.println(pt.getDiscriminant());
        if (pt.getDiscriminant() > 0) {
            System.out.println(pt.getRoot1());
            System.out.println(pt.getRoot2());
        } else if (pt.getDiscriminant() == 0)
            System.out.println(pt.getRoot1());
        else
            System.out.println("No root");
    }
}

class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }
}
