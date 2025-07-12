//the difference between the sum of elements at even indices to the sum of elements at odd indices.
package Arrays_;

public class diff_of_sum_of_indices {
    public static void main(String[] args) {
        int[] arr = {9,1,2,8,3,7,4,5,6,0};
        int n = arr.length;

        int sum_e=0,sum_o=0;
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                sum_e+=arr[i];
            }
            else sum_o+=arr[i];
        }
        int diff = 0;
        if (sum_e>=sum_o) diff = sum_e-sum_o;
        else diff = sum_o-sum_e;
        System.out.println(sum_e+"  "+sum_o);
        System.out.println(diff);
    }
}
