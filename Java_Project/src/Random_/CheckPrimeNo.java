package Random_;

import java.util.Scanner;

public class CheckPrimeNo {
    public static boolean prime(int n){
        if(n<2) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;

        for(int i=5; i*i<=n; i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(prime(n)) System.out.println("Prime no");
        else System.out.println("Not Prime");
    }
}
