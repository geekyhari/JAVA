package Pattern_Printing.Special_Patterns;

import java.util.Scanner;

public class oddTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(2*j-1+"  ");
            }
            System.out.println();
        }
    }
}
