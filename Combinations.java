public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        helper(result, cur, n, k, 0);
        return result;
    }
    
    void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> cur, int n, int k, int count){
        if(count == k){
            result.add(new ArrayList<Integer>(cur));
        }
        for(int i = 0; i < n; i++){
            if(cur.size() == 0 || i + 1 > cur.get(cur.size() - 1)){
                cur.add(i + 1);
                helper(result, cur, n, k, count + 1);
                cur.remove(cur.size() - 1);
            }
        }
    }
}