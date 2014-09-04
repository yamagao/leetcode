public class Solution {
    public int search(int[] A, int target) {
        int i;
        if(target == A[0]){
            return 0;
        }
        if(target == A[A.length - 1]){
            return A.length - 1;
        }
        if(target > A[0]){
            i = 0;
            while(i + 1 < A.length && A[i + 1] > A[i]){
                if(A[i] == target){
                    return i;
                }
                i++;
            }
            if(i < A.length && A[i] == target){
                return i;
            }
            else{
                return -1;
            }
        }
        else{
            i = A.length - 1;
            while(i - 1 > -1 && A[i - 1] < A[i]){
                if(A[i] == target){
                    return i;
                }
                i--;
            }
            if(i > -1 && A[i] == target){
                return i;
            }
            else{
                return -1;
            }
        }
    }
}