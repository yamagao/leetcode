public class Solution {
    public int trap(int[] A) {
        int len = A.length;
        if(len < 3){
            return 0;
        }
        int[] left = new int[len];
        int max = A[0];
        int count = 0;
        for(int i = 1; i < len - 1; i++){
            left[i] = max;
            if(A[i] > max){
                max = A[i];
            }
        }
        max = A[len - 1];
        for(int i = len - 2; i > 0; i--){
            if(A[i] < Math.min(left[i], max)){
                count += Math.min(left[i], max) - A[i];
            }
            if(A[i] > max){
                max = A[i];
            }
        }
        return count;
    }
}