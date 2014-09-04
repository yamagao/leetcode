public class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(s.charAt(i) == ')' && stack.pop() != '('){
                    return false;
                }
                if(s.charAt(i) == ']' && stack.pop() != '['){
                    return false;
                }
                if(s.charAt(i) == '}' && stack.pop() != '{'){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}