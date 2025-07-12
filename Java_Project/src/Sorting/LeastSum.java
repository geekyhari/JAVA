package Sorting;

public class LeastSum {
    public static void main(String[] args) {
        int[] arr = {6,4,8,5,1,7,3,9};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[min]) min = j;
            }
            swap(arr,i,min);
        }
        print(arr);
        int ls=arr[0]+arr[1];
        System.out.println("Least Sum of two numbers="+ls);

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
