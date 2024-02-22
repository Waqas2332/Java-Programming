import java.util.Arrays;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    static int oddCells(int m, int n, int[][] indices) {
        int ans = 0;
        int[][] matrix = new int[m][n];
        for (int[] ints : matrix) {
            Arrays.fill(ints, 0);
        }
        for (int i = 0; i < indices.length; i++) {
            int rows = indices[i][0];
            int cols = indices[i][1];
            for (int j = 0; j < matrix[rows].length; j++) {
                matrix[rows][j]++;
            }
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][cols]++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 2 != 0){
                    ans++;
                }
            }
        }

        return ans;
    }
}
