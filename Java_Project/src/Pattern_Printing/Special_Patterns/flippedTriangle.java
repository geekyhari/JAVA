package Pattern_Printing.Special_Patterns;

import java.util.Scanner;

public class flippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=1; int b=1;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i+j>n){
                    if (i+j==n+1) System.out.println(b+" ");
                    a++;b++;
                }
                else
                    System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
