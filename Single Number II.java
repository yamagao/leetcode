public class Solution {
    public int singleNumber(int[] A) {
        int sum = 0;
        int result = 0;
        for(int i = 0; i < 32 ; i++){
            sum = 0;
            for(int a : A){
                sum += (a >> i) & 1;
            }
            if(sum % 3 == 1){
                result = result | (1 << i);
            }
        }
        return result;
    }
}