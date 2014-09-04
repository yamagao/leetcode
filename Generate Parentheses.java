public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        String cur = "";
        helper(result, cur, n, 0, 0);
        return result;
    }
    
    void helper(ArrayList<String> result, String cur, int n, int left, int right){
        if(left + right == n * 2){
            result.add(cur);
        }
        if(left < n){
            helper(result, cur + "(", n, left + 1, right);
        }
        if(right < left){
            helper(result, cur + ")", n, left, right + 1);
        }
    }
    
}