public class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 1){
            return s;
        }
        String temp = null;
        String result = s.substring(0,0);
        for(int i = 0; i < s.length() - 1; i++){
            temp = helper(s, i, i);
            if(temp != null && temp.length() > result.length()){
                result = temp;
            }
            temp = helper(s, i, i + 1);
            if(temp != null && temp.length() > result.length()){
                result = temp;
            }
        }
        return result;
    }
    
    String helper(String s, int head, int tail){
        while(head > -1 && tail < s.length() && s.charAt(head) == s.charAt(tail)){
            head--;
            tail++;
        }
        return s.substring(head + 1, tail);
    }
}