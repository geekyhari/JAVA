package Arrays_;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the search element:");
        int x = sc.nextInt();
        int a=0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i]==x) {
                a =i;
                flag = true;
                break;
            }
        }
        if (flag==true) System.out.print("Element Found at " + a);
        else System.out.println("Not Found!");
    }
}