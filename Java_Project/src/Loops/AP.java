package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        int a= sc.nextInt();
        System.out.print("Enter common difference: ");
        int d= sc.nextInt();
        System.out.print("Enter the no. of terms: ");
        int n= sc.nextInt();
        int l=a+(n-1)*d;
        for(int i=a;i<=l;i+=d){
            System.out.println(i);
        }
    }
}
