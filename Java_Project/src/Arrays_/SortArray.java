package Arrays_;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,2,0,1,2,0,1,0,2,1,0,0,1,2 };
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int x :arr){
            System.out.print(x + " ");
        }
    }
}
