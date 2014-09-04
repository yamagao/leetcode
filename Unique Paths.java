public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] steps = new int[m][n];
        for(int i = m - 1; i > -1; i--){
            for(int j = n - 1; j > -1; j--){
                if(i == m - 1 || j == n - 1){
                    steps[i][j] = 1;
                }
                else{
                    steps[i][j] = steps[i + 1][j] + steps[i][j + 1];
                }
            }
        }
        return steps[0][0];
    }
}