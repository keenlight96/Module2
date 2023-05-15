package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Abstract1[] temp12 = new Abstract1[2];
        temp12[0] = new Class1(5);
        temp12[1] = new Class2();
        System.out.println(temp12[0] instanceof Abstract1);

        Scanner sc = new Scanner(System.in);
        int a = 0, b = 10, c = 10;
        try {
            System.out.print("Input number: ");
            b = 1000;
            a = sc.nextInt();
            c = 1000;
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
        System.out.println(a + "  " + b + "  " + c);
    }
}
