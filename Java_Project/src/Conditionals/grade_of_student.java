package Conditionals;

import java.util.Scanner;

public class grade_of_student {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        double p= sc.nextDouble();

        if (p>=81 && p<=100) System.out.println("Very Good");
        else if (p>=61 && p<=80 ) System.out.println("Good");
        else if (p>=41 && p<=60 ) System.out.println("Average");
        else System.out.println("Fail");
    }
}
