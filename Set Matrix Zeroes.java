public class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean firstC = false;
        boolean firstR = false;
        for(int i = 0; i < row; i++){
            if(matrix[i][0] == 0){
                firstC = true;
            }
        }
        for(int j = 0; j < col; j++){
            if(matrix[0][j] == 0){
                firstR = true;
            }
        }
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < row; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < col; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 1; j < col; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i < row; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstC){
            for(int i = 0; i < row; i++){
                matrix[i][0] = 0;
            }
        }
        if(firstR){
            for(int j = 0; j < col; j++){
                matrix[0][j] = 0;
            }
        }
    }
}