public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0){
            return 0;
        }
        int len = triangle.get(triangle.size() - 1).size();
        int[] cur = new int[len];
        for(int i = 0; i < len; i++){
            cur[i] = triangle.get(triangle.size() - 1).get(i);
        }
        for(int i = len - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                cur[j] = triangle.get(i).get(j) + Math.min(cur[j], cur[j + 1]);
            }
        }
        return cur[0];
    }
}