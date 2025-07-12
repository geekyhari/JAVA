package Loops;

import java.util.Scanner;

public class composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int x = 0;

        if (n != 0 && n!=1) {
            for (int i = 2; i <= (n - 1); i++) {
                if (n % i == 0) {
                    System.out.println("composite");
                    x = 1;
                    break;
                }
            }
            if (x == 0) System.out.println("Prime");
        } else System.out.println("neither prime nor composite");
//        System.out.println(x);
    }
}
