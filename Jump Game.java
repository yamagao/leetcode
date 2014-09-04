public class Solution {
    public boolean canJump(int[] A) {
        if(A.length == 0){
            return true;
        }
        int max = A[0];
        if(max >= A.length - 1){
            return true;
        }
        for(int i = 1; i <= max; i++){
            if(A[i] + i > max){
                max = A[i] + i;
                if(max >= A.length - 1){
                    return true;
                }
            }
        }
        return false;
    }
    
}