package Basics;// package Basics;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:");
        char ch= sc.next().charAt(0);
        System.out.println(ch);
        int y=(int)ch;
        System.out.println(y);
    }
}
