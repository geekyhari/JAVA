package TwoDimensionalArray;

import java.util.Scanner;

public class PrintingMatrixInWaveform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            if (i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else {
                for (int j = n-1; j >=0 ; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
