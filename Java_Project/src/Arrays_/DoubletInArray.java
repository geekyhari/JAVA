package Arrays_;

import java.util.Scanner;

public class DoubletInArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = {2,7,11,15};
        System.out.print("Enter the number:");
        int x = sc.nextInt();

        boolean y = false;
        for (int i = 0; i < arr.length-1; i++) {
            int j =i;
            for (j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==x)
                    System.out.println(i+" , "+ j);
            }
        }
    }
}
