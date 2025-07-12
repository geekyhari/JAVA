package Java_Project.src.Random_;

import java.util.Scanner;

public class ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2,3,5};
        int n = a.length;
        int x=0;
        int[] b = new int[n*(n-1)];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i!=j){
                    b[x] = a[i]-a[j];
                    x++;
                }
            }
        }
        for (int i = 0; i < n*(n-1); i++) {
            System.out.println(b[i]);
        }
    }
}
