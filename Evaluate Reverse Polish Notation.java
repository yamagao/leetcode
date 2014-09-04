public class Solution {
    public int evalRPN(String[] tokens) {
        int i = 0;
        int j;
        int o1,o2,a=Integer.parseInt(tokens[0]);
        while(i < tokens.length){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                j = i - 1;
                while(tokens[j] == ""){
                    j--;
                }
                o2 = Integer.parseInt(tokens[j]);
                tokens[j] = "";
                j--;
                while(tokens[j].equals("")){
                    j--;
                }
                o1 = Integer.parseInt(tokens[j]);
                tokens[j] = "";
                switch(tokens[i]){
                    case "+": a = o1 + o2; break;
                    case "-": a = o1 - o2; break;
                    case "*": a = o1 * o2; break;
                    case "/": a = o1 / o2;
                }
                tokens[i] = Integer.toString(a);
                i++;
            }
            else{
                i++;
            }
        }
        return a;
    }
}