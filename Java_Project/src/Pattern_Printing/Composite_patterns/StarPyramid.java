package Pattern_Printing.Composite_patterns;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j=1;j<=n+1-i;j++) {
            System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j+=1) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
