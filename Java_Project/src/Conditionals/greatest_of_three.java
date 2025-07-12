package Conditionals;

import java.util.Scanner;

public class greatest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers;");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x>=y){
            if (x>=z) System.out.println("greatest of 3 is "+x);
            else System.out.println("greatest of 3 is "+z);
        } else {
            if (y>=z) System.out.println("greatest of 3 is "+y);
            else System.out.println("greatest of 3 is "+z);
        }
    }
}
