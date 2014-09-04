public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length() + 1];
        t[0] = true;
        for(int i = 0; i < s.length(); i++){
            if(!t[i]){
                continue;
            }
            for(String a : dict){
                if(i + a.length() > s.length()){
                    continue;
                }
                if(a.equals(s.substring(i, i + a.length()))){
                    t[i + a.length()] = true;
                }
            }
        }
        return t[s.length()];
    }
}