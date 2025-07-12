package Arrays_;

import java.util.Scanner;

public class number_of_elements_strictly_greater_than_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int x = sc.nextInt();
        int[] arr = {9,1,2,8,3,7,4,5,6,0};
        int n = arr.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>x) count ++;
        }
        System.out.println(count);
    }
}
