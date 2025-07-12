package Java_Project.src.Arrays_;

import java.util.Arrays;

public class BuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {1,5,67,89,13,46};
        for (int x : arr){  // for each loop
            System.out.print(x + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
