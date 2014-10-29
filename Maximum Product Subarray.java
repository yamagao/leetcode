public class Solution {
    public int maxProduct(int[] A) {
        int r = A[0];
        for(int i = 1, max = r, min = r; i < A.length; i++){
            if(A[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = A[i] > max * A[i] ? A[i] : max * A[i];
            min = A[i] < min * A[i] ? A[i] : min * A[i];
            r = r > max ? r : max;
        }
        return r;
    }
}
