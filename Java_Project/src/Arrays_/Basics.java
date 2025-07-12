package Arrays_;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i <n ; i++) {
            arr [i] = sc.nextInt();
        }
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
