public class Solution {
    public int numDistinct(String S, String T) {
         int slen = S.length();
         int tlen = T.length();
         int[][] num = new int[slen + 1][tlen + 1];
         for(int i = 0; i < slen; i++){
             num[i][0] = 1;
         }
         for(int i = 1; i < slen + 1; i++){
             for(int j = 1; j < tlen + 1; j++){
                 if(S.charAt(i - 1) == T.charAt(j - 1)){
                     num[i][j] = num[i - 1][j - 1] + num[i - 1][j];
                 }
                 else{
                     num[i][j] = num[i - 1][j];
                 }
             }
         }
         return num[slen][tlen];
    }
}