package TwoDimensionalArray;

import java.util.Scanner;

public class SumofElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum =0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("sum="+sum);
    }
}
