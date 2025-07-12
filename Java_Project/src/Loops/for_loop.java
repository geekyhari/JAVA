package Loops;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i+"-Hello world");
        }
    }
}
