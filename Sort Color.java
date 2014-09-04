public class Solution {
    public void sortColors(int[] A) {
        int len = A.length;
        int i = 0;
        int j = len - 1;
        int cur = 0;
        while(cur <= j){
            if(A[cur] == 0){
                A[cur] = A[i];
                A[i] = 0;
                i++;
                cur++;
                continue;
            }
            if(A[cur] == 2){
                A[cur] = A[j];
                A[j] = 2;
                j--;
                continue;
            }
            cur++;
        }
    }
}