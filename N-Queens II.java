public class Solution {
    public int totalNQueens(int n) {
        int[] cur = new int[n];
        return helper(cur, 0, n);
    }
    
    int helper(int[] cur, int row, int n){
        int count = 0;
        if(row == n){
            return 1;
        }
        else{
            for(int i = 0; i < n; i++){
                cur[row] = i;
                if(check(cur, row)){
                    count += helper(cur, row + 1, n);
                }
            }
            return count;
        }
    }
    
    boolean check(int[] cur, int row){
        for(int i = 0; i < row; i++){
            if(cur[i] == cur[row] || Math.abs(cur[i] - cur[row]) == row - i){
                return false;
            }
        }
        return true;
    }
}