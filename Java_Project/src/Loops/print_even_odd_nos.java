package Loops;

import java.util.Scanner;

public class print_even_odd_nos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        for (int i=1;i<=100;i++){
            if (i%3==0 || i%5==0)
                System.out.print(i+" ");
        }
    }
}
