public class Solution {
    public boolean isPalindrome(String s) {
        char[] str = new char[s.length()];
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if((cur <= '9' && cur >= '0') || (cur <= 'z' && cur >= 'a')){
                str[count++] = cur;
            }
            if(cur <= 'Z' && cur >= 'A'){
                str[count++] = (char)(cur - 'A' + 'a');
            }
        }
        int i = 0;
        int j = count - 1;
        while(i < j){
            if(str[i] != str[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}