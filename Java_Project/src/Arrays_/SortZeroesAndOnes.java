package Arrays_;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1};
        int n = arr.length;

        int a = 0; int b=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0) a++;
        }
        for (int i = 0; i < a; i++) {
            arr[i] = 0;
        }
        for (int i = a; i < n; i++) {
           arr[i] = 1;
        }
        for ( int z : arr){
            System.out.print(z + " ");
        }
    }
}
