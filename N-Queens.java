public class Solution {
    public ArrayList<String[]> solveNQueens(int n) {
        int[] cur = new int[n];
        ArrayList<String[]> result = new ArrayList<String[]>();
        helper(cur, 0, result, n);
        return result;
    }
    
    void helper(int[] cur, int row, ArrayList<String[]> result, int n){
        if(row == n){
            String[] toAdd = new String[n];
            for(int i = 0; i < n; i++){
                StringBuilder s = new StringBuilder();
                for(int j = 0; j < n; j++){
                    if(j == cur[i]){
                        s.append("Q");
                    }
                    else{
                        s.append(".");
                    }
                }
                toAdd[i] = s.toString();
            }
            result.add(toAdd);
            return;
        }
        else{
            for(int i = 0; i < n; i++){
                cur[row] = i;
                if(check(cur, row)){
                    helper(cur, row + 1, result, n);
                }
            }
            return;
        }
    }
    
    boolean check(int[] result, int row){
        for(int i = 0; i < row; i++){
            if(result[i] == result[row] || Math.abs(result[i] - result[row]) == row - i){
                return false;
            }
        }
        return true;
    }
}