public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        int num = 0;
        for(int i = 0; i < prefix.length(); i++){
            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != prefix.charAt(i)){
                    num = i;
                    return prefix.substring(0, num);
                }
            }
        }
        return strs[0];
    }
}