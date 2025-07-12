//Given an array of integers, change the value of all odd indexed elements to its second multiple and
//increment all even indexed values by 10.
package Arrays_;

public class ChangesInarray {
    public static void main(String[] args) {
        int[] arr = {9, 1, 2, 8, 3, 7, 4, 5, 6, 0};
        int n = arr.length;

        int sum_e = 0, sum_o = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += 10;
            } else arr[i] *= 2;
        }
        for (int x : arr){
            System.out.print(x+" ");
        }
    }
}
