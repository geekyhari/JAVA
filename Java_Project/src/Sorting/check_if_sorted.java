package Sorting;
import java.util.Scanner;
public class check_if_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]) {
                System.out.println("unsorted");
                break;
            }
            else {
                System.out.println("sorted");
                break;
            }
        }
    }
}
