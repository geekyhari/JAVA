package Methods;

import java.util.Scanner;

public class basics {
    static int method(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=sc.nextInt(); b= sc.nextInt();
        sum = method(a,b);
        System.out.println(sum);
    }
}
