package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum=0;
        while(n!=0){
            int ld = n%10;
            sum+=ld;
            n/=10;
        }
        System.out.println(sum);
    }
}
