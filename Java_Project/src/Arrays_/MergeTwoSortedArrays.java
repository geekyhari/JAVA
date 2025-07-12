package Arrays_;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {0,2,4,6,8,11,12,13};
        int n = arr1.length, m = arr2.length;
        int[] arr3 = new int[n+m]; 

        int i=0,j=0,k=0;
        while (i<n && j<m){
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;k++;
            } else {
                arr3[k] = arr2[j];
                k++;j++;
            }
        }
        if (i==n){
            while(j<m){
                arr3[k] = arr2[j];
                j++;k++;
            }
        }
        if (j==m){
            while (i<n){
                arr3[k] = arr1[i];
                i++;k++;
            }
        }
        for (int x : arr3){
            System.out.print(x +" ");
        }
    }
}
