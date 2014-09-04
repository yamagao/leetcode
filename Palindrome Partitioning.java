public class Solution {
    public ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        ArrayList<String> list = new ArrayList<String>();
        helper(result, list, s);
        return result;
    }
    
    void helper(ArrayList<ArrayList<String>> result, ArrayList<String> list, String s){
        if(s.length() == 0){
            result.add(new ArrayList<String>(list));
        }
        for(int i = 1; i < s.length() + 1; i++){
            if(isP(s.substring(0, i))){
                list.add(s.substring(0, i));
                helper(result, list, s.substring(i));
                list.remove(list.size() - 1);
            }
        }
    }
    
    boolean isP(String s){
        if(s ==  null){
            return false;
        }
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}