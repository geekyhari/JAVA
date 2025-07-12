package Java_Project.src.BinarySearch;

public class RotatedSortedArray {
    public int bs(int[] arr,int l,int h, int t){
        while(l<=h){
            int m = l+(h-l)/2;
            if(arr[m]==t) return m;
            else if(arr[m]<t) l=m+1;
            else h=m-1;
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        int n = arr.length;
        if(n<=2){
            for(int i=0;i<n;i++){
                if(arr[i]==target) return i;
            }
            return -1;
        }
        int l=1,h=n-2,p=-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if(arr[m]>arr[m+1] && arr[m]>arr[m-1]) {
                p=m;
                break;
            }
            else if(arr[m]<arr[m+1] && arr[m]<arr[m-1]){
                p=m-1;
                break;
            }
            else if(arr[m]<arr[m+1] && arr[m]>arr[m-1]){
                if(arr[m]>arr[n-1]) l=m+1;
                else h = m-1;
            }
        }
        if(p==-1){
            return bs(arr,0,n-1,target);
        }
        int left = bs(arr,0,p,target);
        if(left!=-1) return left;
        int right = bs(arr,p+1,n-1,target);
        return right;
    }
}
