package Arrays_;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {15,12,48,52,14,65};
        for (int x : arr){
            System.out.print(x +" ");
        }
        int[] brr = Arrays.copyOf(arr,arr.length);
        System.out.println();
        brr[1] = 69;
        for (int x : brr){
            System.out.print(x + " ");
        }
        int[] crr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            crr[i]=arr[i];
        }
        System.out.println();
        for (int y : crr){
            System.out.print(y + " ");
        }
    }
}
