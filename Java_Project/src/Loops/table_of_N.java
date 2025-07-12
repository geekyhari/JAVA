package Loops;

import java.util.Scanner;

public class table_of_N {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Table of: ");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+i*n);
        }
    }
}
