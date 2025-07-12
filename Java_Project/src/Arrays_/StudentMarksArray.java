package Arrays_;

import java.util.Scanner;

public class StudentMarksArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of students:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the marks:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]<35)
                System.out.println(i);
        }
    }
}
