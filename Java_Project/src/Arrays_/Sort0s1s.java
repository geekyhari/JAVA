package Arrays_;

public class Sort0s1s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1};
        int n = arr.length;

        int i=0,j=n-1;
        while (i<j){
            if (arr[i]==0) i++;
            if (arr[j]==1) j--;
            if (i<j && arr[i] == 1 && arr[j] == 0){
                arr[i] = 0; arr[j] = 1;
                i++; j--;
            }
        }
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
