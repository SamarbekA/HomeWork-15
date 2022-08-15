package HW_15;

import java.util.Scanner;

public class Circle {

    static void radius(double r) {
        Scanner sc = new Scanner(System.in);
        double area = Math.PI*Math.pow(r,2);
        System.out.println("Area");
        System.out.println(Math.PI + " * " + r + " * "+ r +" = " + area);

        System.out.println("Circumference");
        double circumference = Math.PI * 2 * r;
        System.out.println(Math.PI + " * " + 2 + " * " + r + " = " + circumference);
    }



    static void circumference(double r) {
        double circumference = Math.PI * 2 * r;
        System.out.println(Math.PI + " * " + 2 + " * " + r + " = " + circumference);
    }
}
