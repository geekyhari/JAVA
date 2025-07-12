package Conditionals;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double l=sc.nextDouble();
        System.out.print("enter the breadth: ");
        double b=sc.nextDouble();
        double p=2*(l+b);
        double a=l*b;

        if(a>p) System.out.println("area is greater than the perimeter!");
        else System.out.println("area is not greater than the perimeter!");
    }
}
