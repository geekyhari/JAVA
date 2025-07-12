package Java_Project.src.BinarySearch;

import java.util.Scanner;

import static java.util.Collections.min;

public class LowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i= 0 ;i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            if(arr[i] == num) {
//                System.out.println(i);
//                break;
//            }
//            else if(arr[i]>num){
//                System.out.println(i);
//                break;
//            }
//        }
        int l=0,h=n-1,lb=n;
        while(l<=h){
            int m = (h-l)/2+l;
            if(arr[m]>= num){
                lb = Math.min(lb,m);
                h = m -1;
            }
            else l=m+1;
        }
    }
}
