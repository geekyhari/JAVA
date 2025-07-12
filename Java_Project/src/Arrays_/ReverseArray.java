package Arrays_;

import org.w3c.dom.ls.LSOutput;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int n = arr.length;

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        /* USING VARIABLE AND FOR LOOP
        for (int i = 0; i < n/2; i++) {
            int j=n-i-1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/
        int i=1, j=n-2;
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
