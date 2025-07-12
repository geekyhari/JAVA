package Sorting;

public class MoveZeroes {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,13,9,0,8,7,6};
        int n = arr.length;
        int noz = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0) noz++;
        }
        for (int x = 0; x < noz; x++) {
            for (int i = 0; i < n-x-1; i++) {
                if (arr[i] == 0){
                    reverse(arr,i,i+1);
                }
            }
        }
        print(arr);
    }
    public static void reverse(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
