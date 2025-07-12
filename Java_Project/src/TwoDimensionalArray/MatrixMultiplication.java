package TwoDimensionalArray;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the array-1:");
        int m1 = sc.nextInt(); int n1 = sc.nextInt();
        int[][] arr = new int[m1][n1];
        System.out.println("Enter the size of the array-2:");
        int m2 = sc.nextInt(); int n2 = sc.nextInt();
        int[][] brr = new int[m2][n2];

        if (n1!=m2) System.out.println("The matrices can't be multiplied!!");
        else{
            int[][] ans = new int[m1][n2];
            System.out.println("Enter the elements of matrix 1:");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements:");
            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    brr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    for (int k = 0; k < n1; k++) {
                        ans[i][j] += arr[i][k] * brr[k][j];
                    }
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
