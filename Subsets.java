public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        int len = S.length;
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> cur = new ArrayList<Integer>();
    	result.add(cur);
    	Arrays.sort(S);
    	for(int i = 0; i < len; i++){
    		ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
    		for(ArrayList<Integer> a : result){
                temp.add(new ArrayList<Integer>(a));
    		}
    		for(ArrayList<Integer> a : temp){
                a.add(S[i]);
                result.add(new ArrayList<Integer>(a));
    		}
    	}
    	return result;
    } 
}