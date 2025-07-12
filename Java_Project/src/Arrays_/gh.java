package Arrays_;

public class gh {

        public static void main(String[] args) {
            int A [] = {1,2,3,4,5,6,7,8,9};
            rotate(A, 3);
            print(A);
        }
        static void rotate(int A[], int k){
            for(int j=0;j<k;j++){
                int temp = A[0];
                for(int i=0;i<A.length-1;i++){
                    A[i] =A[i+1];
                }
                A[A.length-1] = temp;
            }

        }
        static void print(int A[]){
            for(int i=0;i<A.length;i++){
                System.out.print(A[i]+" ");
            }
        }
    }

