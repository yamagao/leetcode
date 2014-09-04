public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] flag = new int[9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int index = board[i][j] - '1';
                    if(flag[index] == 0){
                        flag[index] = 1;
                    }
                    else{
                        return false;
                    }
                }
            }
            for(int j = 0; j < 9; j++){
                flag[j] = 0;
            }
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[j][i] != '.'){
                    int index = board[j][i] - '1';
                    if(flag[index] == 0){
                        flag[index] = 1;
                    }
                    else{
                        return false;
                    }
                }
            }
            for(int j = 0; j < 9; j++){
                flag[j] = 0;
            }
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[j % 3 + (i / 3) * 3][j / 3 + (i * 3) % 9] != '.'){
                    int index = board[j % 3 + (i / 3) * 3][j / 3 + (i * 3) % 9] - '1';
                    if(flag[index] == 0){
                        flag[index] = 1;
                    }
                    else{
                        return false;
                    }
                }                
            }
            for(int j = 0; j < 9; j++){
                flag[j] = 0;
            }
        }
        return true;
    }
}