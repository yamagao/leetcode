public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(n == 0){
            result.add(0);
            return result;
        }
        result.add(0);
        result.add(1);
        for(int i = 1; i < n; i++){
            int len = result.size();
            for(int j = len - 1; j > -1; j--){
                result.add((1 << i) + result.get(j));
            }
        }
        return result;
    }
}