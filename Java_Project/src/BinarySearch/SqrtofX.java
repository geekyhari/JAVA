package Java_Project.src.BinarySearch;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SqrtofX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        long n = sc.nextInt();
//        System.out.println((int)Math.sqrt(n)); // newton raphson method

//        int[] arr = new int[n];
//        for (int i = 1; i <= n; i++) {
//            arr[i]=i;
//        }
        long l=0,h=n-1;
        while(l<=h){
            long m = l+(h-l)/2;
            if(m*m==n) {
                System.out.println((int)m);
                break;
            }
            else if(m*m<n) l=m+1;
            else h=m-1;
        }
    }
}
