package Pattern_Printing.Squares;

import java.util.Scanner;

public class starSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows and columns:");
        int m = sc.nextInt();

        for (int i=1;i<=m;i++){
            for (int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}