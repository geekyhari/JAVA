package Arrays_;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,2,2,1};
        int n = arr.length;

        boolean con = true;
        int j=n-1;
        for (int i=0;i<n/2;i++ ){
            if (arr[i]!=arr[j]) {
                con = false;
                break;
            }
            j--;
        }
        if (con==true) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}
