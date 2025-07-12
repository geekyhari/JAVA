package Arrays_;

public class Sort_zeros_ones_twos {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 2, 0, 1, 2, 0, 1, 0, 2, 1, 0, 0, 1, 2};
        int n = arr.length;

        int a=0,b=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0) a++;
            if (arr[i]==1) b++;
        }
        for (int i = 0; i < n; i++) {
            if (i<=a) arr[i]=0;
            else if (i<=a+b) {
                arr[i]=1;
            }
            else arr[i] =2;
        }
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
