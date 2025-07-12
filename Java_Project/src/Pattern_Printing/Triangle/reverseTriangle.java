package Pattern_Printing.Triangle;

import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        for (int i=n;i>=1;i--){        // for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){         //for (int j=1;j<n+1-i;j++)
                System.out.print((char)(i+64)+"  ");
            }
            System.out.println();
        }
    }
}
