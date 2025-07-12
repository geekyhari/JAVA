package Java_Project.src.BinarySearch;

import java.util.Scanner;

public class Binary_Search {
    public static int binarysearch(int n, int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element: ");
        int t = sc.nextInt();

        int l=0;
        int h=n-1;
        while (l<=h){
            int m=l+(h-l)/2;
            if(arr[m]<t) l=m+1;
            else if(arr[m]>t) h=m-1;
            else return m;
        } return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i= 0 ;i<n; i++){
            arr[i] = sc.nextInt();
        }

        int bi = binarysearch(n,arr);
        if(bi==-1) System.out.println("Not found");
        else System.out.println("Target at :" + (bi + 1));

    }
}
