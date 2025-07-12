package Sorting;

import org.w3c.dom.ls.LSOutput;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5,0};
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
        print(arr);
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void print(int[] arr) {
        for (int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }
}
