package Arrays_;

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int product=1;
        for (int i = 0; i < n; i++) {
            product *=arr[i];
        }
        System.out.println("Product="+product);
    }
}
