package HW_15;

import java.util.Scanner;

public class Main {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Enter the radius:");
        int num = sc.nextInt();


        Circle.radius(num);

    }

}