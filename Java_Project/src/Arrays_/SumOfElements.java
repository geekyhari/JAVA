package Arrays_;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum +=arr[i];
        }
        System.out.println("Sum="+sum);
    }
}
