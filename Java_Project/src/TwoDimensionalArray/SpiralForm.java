package TwoDimensionalArray;

import java.util.Scanner;

public class SpiralForm {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
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
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int maxr=m-1; int minr = 0; int maxc = n-1; int minc = 0;
        while ((minr <= maxr) && (minc <= maxc)){
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j]+" ");
            }minr++;
            if (minr>maxr || minc>maxc ) break;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc]+" ");
            }maxc--;
            if (minr>maxr || minc>maxc ) break;
            for (int j = maxc; j >=minc ; j--) {
                System.out.print(arr  [maxr][j]+" ");
            }maxr--;
            if (minr>maxr || minc>maxc ) break;
            for (int i = maxr; i >=minr ; i--) {
                System.out.print(arr[i][minc]+" ");
            }minc++;
        }
    }
}
