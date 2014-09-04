public class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        int n = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][n - i - 1];
                matrix[n - j - 1][n - i - 1] = temp;
            }
        }
        for(int i = 0; i < n / 2; i++){
            for(int j = 0; j < n; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
    }
}