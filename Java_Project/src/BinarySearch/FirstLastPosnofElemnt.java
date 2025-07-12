package Java_Project.src.BinarySearch;

import java.util.Scanner;

public class FirstLastPosnofElemnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i= 0 ;i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int t = sc.nextInt();

        int[] ans = {-1,1};
        int l=0,h=n-1,lb=n,ub=n;
        boolean flag = false;
        while (l<=h) {
            int m = l + (h - l) / 2;
            if (arr[m] == t) {
                flag = true;
                break;
            } else if (arr[m] < t) l = m + 1;
            else if (arr[m] > t) h = m - 1;
        }
        if(flag){
            l=0;h=n-1;
            while (l<=h){
                int m= l+(h-l)/2;
                if(arr[m]>=t){
                    lb = Math.min(lb,m);
                    h=m-1;
                }
                else l=m+1;
            }
            ans[0]=lb;
            l=0;h=n-1;
            while (l<=h){
                int m = l + (h - l) / 2;
                if(arr[m]>t){
                    ub = Math.min(lb,m);
                    h=m-1;
                }
                else l=m+1;
            }
            ans[1]=ub;
        }
        
        for(int x : ans){
            System.out.println(x+" ");
        }
    }
}
