package Conditionals;

import java.util.Scanner;

public class absolute_no {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();

        if (x<0) System.out.println(-x);
        else System.out.println(x);
    }
}
