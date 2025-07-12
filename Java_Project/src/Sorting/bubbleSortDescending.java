package Sorting;

import java.util.Scanner;

public class bubbleSortDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Bubble Sort descending
        boolean flag;
        for (int x = 0; x < n-1; x++) {
            flag = true;
            for (int i = 0; i < n-1-x; i++) {
                if(arr[i]<arr[i+1]) reverse(arr,i,i+1);
                flag = false;
            }
            if (flag) break;
        }
        print(arr);
    }
    private static void reverse(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void print(int[] arr){
        for(int ele : arr) System.out.print(ele+" ");
    }
}
