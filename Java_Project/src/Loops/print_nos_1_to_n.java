package Loops;

import java.util.Scanner;

public class print_nos_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
