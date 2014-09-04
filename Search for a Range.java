public class Solution {
    public int[] searchRange(int[] A, int target) {
        int[] result = new int[]{-1, -1};
        int start = 0;
        int end = A.length - 1;
        int mid = 0;
        while(start < end){
            mid = (start + end) / 2;
            if(A[mid] >= target){
                end = mid;
                continue;
            }
            if(A[mid] < target){
                start = mid + 1;
                continue;
            }
        }
        if(A[start] != target){
            return result;
        }
        else{
            result[0] = start;
        }
        end = A.length - 1;
        while(start < end){
            mid = (start + end) / 2 + 1;
            if(A[mid] <= target){
                start = mid;
                continue;
            }
            if(A[mid] > target){
                end = mid - 1;
                continue;
            }
        }
        result[1] = end;
        return result;
    }
}