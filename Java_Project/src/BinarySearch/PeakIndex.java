package Java_Project.src.BinarySearch;

import java.util.Scanner;

public class PeakIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i= 0 ;i<n; i++){
            arr[i] = sc.nextInt();
        }

        int l=1,h=n-2;
        int m = l+(h-l)/2;
        while(l<=h){

            if(arr[m]>arr[m-1] && arr[m]>arr[m+1]) {
                System.out.println(m);
                break;
            }
            else if (arr[m]<arr[m+1] && arr[m]>arr[m-1]) m++;
            else if(arr[m]>arr[m+1] && arr[m]<arr[m-1]) m--;
        }
    }
}
