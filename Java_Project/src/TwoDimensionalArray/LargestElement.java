package TwoDimensionalArray;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns:");
        int m = sc.nextInt(); int n = sc.nextInt();
        int[][] arr = new int[m][n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int max = arr[0][0]; //int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]>max){     //max = Math.max(mx,arr[i][j]);
                    max = arr[i][j];
                }
            }
        }
        System.out.println("MAX=" + max);
    }
}
