package Pattern_Printing.Squares;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of rows:");
        int n=sc.nextInt();
        System.out.print("No. of Columns:");
        int m= sc.nextInt();

        for (int i=1;i<=n;i++) { //rows
            for (int j = 1; j <= m; j++) {   //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
