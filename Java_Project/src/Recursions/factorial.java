package Recursions;

import java.util.Scanner;

public class factorial {
    public static long fact(int n){
        if(n==0 || n==1) return 1;
        long f = 1;
        f=n*fact(n-1);
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
