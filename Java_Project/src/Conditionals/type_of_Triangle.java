package Conditionals;

import java.util.Scanner;

public class type_of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of triangle:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x==y && y==z) System.out.println("Equilateral Triangle");
        else if ((x==y || y==z || x==z)) System.out.println("Isosceles Triangle");
        else if (x!=y || y!=z || z!=x) System.out.println("Scalene Triangle");
        else if ((z+y)>z && (y+z)>x && (x+z)>y) System.out.println("Not a Triangle");
    }
}
