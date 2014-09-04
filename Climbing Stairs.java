public class Solution {
    public int climbStairs(int n) {
        if(n == 0){
            return 0;
        }
        int[] steps = new int[n];
        for(int i = 0; i < n; i++){
            if(i == 0 || i == 1){
                steps[i] = i + 1;
            }
            else{
                steps[i] = steps[i - 1] + steps[i - 2];
            }
        }
        return steps[n - 1];
    }
}