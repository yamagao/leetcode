public class Solution {
    public List<String> wordBreak(String s, Set<String> dict) {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("");
        map.put(s.length(), list);
        for(int i = s.length() - 1; i > -1; i--){
            List<String> newlist = new ArrayList<String>();
            for(int j = i + 1; j <= s.length(); j++){
                if(dict.contains(s.substring(i,j))){
                    for(String sentence : map.get(j)){
                        newlist.add(s.substring(i,j) + (sentence.isEmpty()? "" : " ") + sentence);
                    }
                }
            }
            map.put(i, newlist);
        }
        return map.get(0);
    }
}
