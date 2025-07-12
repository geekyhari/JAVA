package Arrays_;

import java.util.Scanner;

public class Rotate_array_byKsteps {
    public static void reverse(int[] nums,int i,int j) {
        while (i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int n = nums.length;

        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

        for (int x : nums){
            System.out.print(x + " ");
        }
    }
}
