public class Solution {
    public int searchInsert(int[] A, int target) {
        int i;
        for(i = 0; i < A.length; i++){
            if(A[i] >= target){
                break;
            }
        }
        return i;
    }
}