public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int head = 0;
        int tail = 0;
        int count = 0;
        int temp = 0;
        while(tail < s.length()){
            if(!map.containsKey(s.charAt(tail))){
                temp++;
                if(temp > count){
                    count = temp;
                }
                map.put(s.charAt(tail), 1);
                tail++;
            }
            else{
                map.remove(s.charAt(head));
                head++;
                temp--;
            }
        }
        return count;
    }
}