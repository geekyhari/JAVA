package Basics;

import java.util.Scanner;

//public class practice_questions {
//    public static void main(String[] args) {
//        System.out.print("Enter the value of x:");
//        Scanner sc=new Scanner(System.in);
//        int x= sc.nextInt();
//        System.out.print("Enter the value of y:");
//        int y= sc.nextInt();
//        System.out.println(x+y);
//        System.out.println(x-y);
//        double a=(double)x;
//        double b=(double)y;
//        System.out.println(a*b);
//        System.out.println(a/b);
//    }
//}

public class practice_questions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius:");
        double r= sc.nextDouble();
        System.out.println("Area of circle="+(3.14*r*r));
        System.out.print("Enter the principal amount:");
        int p= sc.nextInt();
        System.out.print("Enter the rate of interest:");
        double roi=sc.nextDouble();
        System.out.print("Enter time(in years):");
        double t=sc.nextDouble();
        System.out.println("Simple interest="+(p*roi*t/100));

    }
}
