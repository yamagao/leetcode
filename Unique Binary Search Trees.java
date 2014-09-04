public class Solution {
    public int numTrees(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        LinkedList<Integer> result = new LinkedList<Integer>();
        result.add(1);
        result.add(1);
        int temp;
        for(int i = 2; i <= n; i++){
            temp = 0;
            for(int j = 0; j < i; j++){
                temp += result.get(j) * result.get(i - j - 1); 
            }
            result.add(temp);
        }
        return result.get(n);
    }
}