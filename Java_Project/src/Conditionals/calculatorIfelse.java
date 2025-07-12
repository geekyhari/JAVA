package Conditionals;

import java.util.Scanner;

public class calculatorIfelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        char a = sc.next().charAt(0);
        int y = sc.nextInt();

        if (a == '+') {
            System.out.println(x + y);
        } else if (a == '-') {
            System.out.println(x - y);
        } else if (a == '*') {
            System.out.println(x * y);
        } else if (a == '/') {
            if (y != 0) {
                System.out.println((double)x / y);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Error: Invalid operator");
        }
    }
}