public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        while(i < row && matrix[i][0] <= target){
            i++;
        }
        if(i == 0){
            return false;
        }
        i--;
        int j = 0;
        while(j < col && matrix[i][j] <= target){
            j++;
        }
        if(matrix[i][--j] == target){
            return true;
        }
        else{
            return false;
        }
    }
}