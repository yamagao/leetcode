public class Solution {
    public int longestConsecutive(int[] num) {
        Set<Integer> set = new HashSet<Integer>();
        for(int a : num){
            set.add(a);
        }
        int result = 0;
        for(int a : num){
            int left = a - 1;
            int right = a + 1;
            int count = 1;
            while(set.contains(left)){
                count++;
                set.remove(left);
                left--;
            }
            while(set.contains(right)){
                count++;
                set.remove(right);
                right++;
            }
            result = count > result ? count : result;
        }
        return result;
    }
}