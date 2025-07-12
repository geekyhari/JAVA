/*
package Arrays_;

public class Duplicate_Elements {
    public static void main(String[] args) {
        int[] arr = {1,1,5,2,5,4,7,4,5,2,1,3,6,9,7,4,1,2};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}
*/
package Arrays_;

public class Duplicate_Elements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 5, 2, 5, 4, 7, 4, 5, 2, 1, 3, 6, 9, 7, 4, 1, 2};
        int n = arr.length;

        System.out.println("Duplicate elements in the array:");

        // Loop through each element of the array
        for (int i = 0; i < n; i++) {
            // Inner loop to compare current element with others
            for (int j = i + 1; j < n; j++) {
                // Check for duplicate by comparing two different indices
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // Break once a duplicate is found for arr[i]
                }
            }
        }
    }
}
