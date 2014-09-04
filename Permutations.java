public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        int[] mask = new int[num.length];
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        helper(result, cur, num.length, 0, num, mask);
        return result;
    }
    
    void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> cur, int n, int count, int[] num, int[] mask){
        if(count == n){
            ArrayList<Integer> addNew = new ArrayList<Integer>(cur);
            result.add(addNew);
        }
        else{
            for(int i = 0; i < num.length; i++){
                if(mask[i] == 0){
                    cur.add(num[i]);
                    mask[i] = 1;
                    helper(result, cur, n, count + 1, num, mask);
                    mask[i] = 0;
                    cur.remove(cur.size() - 1);
                }
            }
        }
    }
}