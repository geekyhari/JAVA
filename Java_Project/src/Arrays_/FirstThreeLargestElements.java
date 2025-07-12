package Arrays_;

public class FirstThreeLargestElements {
    public static void main(String[] args) {
        int[] arr = {9,1,2,8,3,7,4,5,6,0};
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
        for (int i = n-3; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
