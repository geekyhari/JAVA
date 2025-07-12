package Sorting;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        //BubbleSort-1
//        for (int j = 0; j<n-1; j++) {
//            for (int i = 0; i < n-1-j; i++) {
//                if (arr[i]>arr[i+1]) reverse(arr,i,i+1);
//            }
//        }

        //BubbleSort Optimised
        boolean flag;
        for (int j = 0; j<n-1; j++) {
            flag = true;
            for (int i = 0; i < n-1-j; i++) {
                if (arr[i]>arr[i+1]) reverse(arr,i,i+1);
                flag = false;
            }
            if (flag) break;
        }
        print(arr);
    }

    private static void reverse(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


