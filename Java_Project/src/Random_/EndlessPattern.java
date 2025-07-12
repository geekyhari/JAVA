package Java_Project.src.Random_;

import java.util.Scanner;

public class EndlessPattern {
    public static int sum(int n) {
        int sum = 0;
        while(n!=0){
            sum += (n%10);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int s=1;
        int t=1;

        for (int i = 1; i < n; i++) {
            s+=sum(s);
        }
        System.out.println(s);
    }
}
