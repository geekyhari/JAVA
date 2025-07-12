package Arrays_;

public class MinValueInArray {
    public static void main(String[] args) {
        int[] arr = {9,1,2,8,3,7,4,5,6,0};
        int n = arr.length;

        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]<min) min = arr[i];
        }
        System.out.println(min);
    }
}
