public class Solution {
    public String countAndSay(int n) {
        if(n == 0){
            return "";
        }
        String result = "1";
        int count = 0;
        while(n > 1){
            String temp = "";
            String cur = result.substring(0, 1);
            count = 1;
            for(int i = 1; i < result.length(); i++){
                if(result.substring(i, i + 1).equals(cur)){
                    count++;
                }
                else{
                    temp += count + cur;
                    cur = result.substring(i, i + 1);
                    count = 1;
                }
            }
            temp += count + cur;
            result = temp;
            n--;
        }
        return result;
    }
}