package TwoDimensionalArray;

public class SetMatrixToZeroM1 {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = arr.length , n = arr[0].length;

        int[][] help = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                help[i][j] = arr[i][j];
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(help[i][j] == 0){
                    // set 0 for ith row and jth col
                    for(int b = 0; b < n; b++){
                        arr[i][b] = 0;
                    }
                    for(int a = 0; a < m; a++){
                        arr[a][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
