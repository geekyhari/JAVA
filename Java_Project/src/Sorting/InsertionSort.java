package Sorting;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5,0};
        int n = arr.length;
        print(arr);

        //Insertion Sort
//        for (int i = 1; i < n; i++) {
//            for (int j = i; j >= 1; j--) {
//                if (arr[j]<arr[j-1]) swap(arr,j,j-1);
//                else break;
//            }
//        }
//        for (int i = 1; i < n; i++) {
//            for (int j = i; j >= 1 && arr[j]<arr[j-1]; j--) {
//                swap(arr,j,j-1);
//            }
//        }

        for (int i = 1; i < n; i++) {
            int j=i;
            while(j>=1 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
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
