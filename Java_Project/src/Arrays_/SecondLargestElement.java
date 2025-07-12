package Arrays_;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (arr[i]>mx) mx=arr[i];
        }
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (arr[i]!=mx)
                smx = Math.max(smx,arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
