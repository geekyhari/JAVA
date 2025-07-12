package TwoDimensionalArray;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        Scanner sc = new Scanner(System.in);

//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;

        int m= arr.length; // no. of rows/lines
        int n= arr[0].length; // no of columns
        System.out.println("Enter the elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
