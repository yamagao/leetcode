public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        if(dict.size() == 0){
            return 0;
        }
        LinkedList<String> queue = new LinkedList<String>();
        LinkedList<Integer> len = new LinkedList<Integer>();
        
        String curStr = "";
        int curLen = 0;
        queue.add(start);
        len.add(1);
        while(!queue.isEmpty()){
            curStr = queue.remove();
            curLen = len.remove();
            if(curStr.equals(end)){
                return curLen;
            }
            for(int i = 0; i < curStr.length(); i++){
                char[] curChar = curStr.toCharArray();
                for(char j = 'a'; j <= 'z'; j++){
                    if(j == curStr.charAt(i)){
                        continue;
                    }
                    curChar[i] = j;
                    if(dict.contains(String.valueOf(curChar))){
                        queue.add(String.valueOf(curChar));
                        len.add(curLen + 1);
                        dict.remove(String.valueOf(curChar));
                    }
                }
            }
        }
        return 0;
    }
}