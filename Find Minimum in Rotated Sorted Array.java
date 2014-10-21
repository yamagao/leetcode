public class Solution {
    public int findMin(int[] num) {
        int length = num.length;
        return findMin(num, 0, length - 1);
    }
    
    public int findMin(int[] num, int start, int end){
        if(start == end){
            return num[start];
        }
        if(num[(start + end) / 2] > num[end]){
            return findMin(num, (start + end) / 2 + 1, end);
        }
        else{
            return findMin(num, start, (start + end) / 2);
        }
    }
}
