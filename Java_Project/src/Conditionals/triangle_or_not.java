package Conditionals;

import java.util.Scanner;

public class triangle_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three of triangle:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if ((a+b)>c && (b+c)>a && (a+c)>b) System.out.println("A Triangle");
        else System.out.println("Not a Triangle");
    }
}
