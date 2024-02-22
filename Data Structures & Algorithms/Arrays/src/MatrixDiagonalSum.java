public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[] []mat = {{1,2,3},
        {4,5,6},
        {7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int i = 0;
        int j = mat.length - 1;
        while(i < j){
            sum += mat[i][i];
            sum += mat[j][j];
            sum += mat[i][j];
            sum += mat[j][i];

            i++;
            j--;
        }
        if(mat.length % 2 != 0){
            sum += mat[i][i];
        }


        return sum;
    }
}
