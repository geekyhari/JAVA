//package Java_Project.src.Random_;
//
//import java.util.Scanner;
//
//public class LostAlien {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the No. of test cases:");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i = 0;i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        String[] ans = new String[n];
//        int d=0;
//        for (int i = 0; i < n; i++) {
//            while(arr[0]!=0){
//                int x = arr[0];
//                int r = x%10;
//                if(r==1) d=r
//                if(d==r) ans[i] = "Invalid";
//                x/=10;d=r;
//            }
//        }
//    }
//}
