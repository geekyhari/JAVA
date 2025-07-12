package TwoDimensionalArray;

import java.util.Scanner;

public class RotateArrayBy90 {
    public static void print(int[][] arr){
        int m = arr.length; int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int m = sc.nextInt(); int n = sc.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] =temp;
            }
        }
        print(arr);

        for (int i = 0; i < m; i++) {
            int b = n-1; int a=0;
            while (a<=b){
                int temp= arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;b--;
            }
        }
        print(arr);
    }
}
