public class Solution {
    public int minCut(String s) {
        int[] cuts = new int[s.length() + 1];
        boolean[][] matrix = new boolean[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++){
            cuts[i] = s.length() - i;
            matrix[i][i] = true;
        }
        cuts[s.length()] = 0;
        for(int i = s.length() - 2; i >= 0; i--){
            for(int j = i + 1; j < s.length(); j++){
                if((j - i < 2 && s.charAt(i) == s.charAt(j)) || (matrix[i + 1][j - 1] && s.charAt(i) == s.charAt(j))){
                    matrix[i][j] = true;
                    cuts[i] = Math.min(cuts[i], cuts[j + 1] + 1);
                }
            }
            cuts[i] = Math.min(cuts[i], cuts[i + 1] + 1);
        }
        return cuts[0] - 1;
    }
}