package Conditionals;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int x=sc.nextInt();

        System.out.println(x%2==0? "Even":"Odd");
    }
}
