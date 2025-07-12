package Basics;
import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("the square of "+n+" is :"+n*n);
    }
}
