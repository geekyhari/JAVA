package Conditionals;

import java.util.Scanner;

public class least_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();

        if (x<=y && x<=z) System.out.println(x+" is least");
        else if (y<=x && y<=z) {
            System.out.println(y+" is least");
        } else System.out.println(z+" is least");
    }
}
