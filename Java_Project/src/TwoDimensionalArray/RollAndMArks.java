package TwoDimensionalArray;

import java.util.Scanner;

public class RollAndMArks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];

        System.out.println("Enter the Roll and Marks:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] x : arr){
            for (int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
