public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] diff = new int[gas.length];
        int sum = 0;
        for(int i = 0; i < gas.length; i++){
            diff[i] = gas[i] - cost[i];
            sum += diff[i];
        }
        if(sum < 0){
            return -1;
        }
        for(int i = 0; i < gas.length; i++){
            sum = 0;
            for(int j = i; j < gas.length; j++){
                sum += diff[j];
                if(sum < 0){
                    break;
                }
            }
            if(sum < 0){
                continue;
            }
            else{
                return i;
            }
        }
        return -1;
    }
}