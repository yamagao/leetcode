public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int length = 0;
        int test = x;
        while(test != 0){
            length++;
            test /= 10;
        }
        int i = length / 2;
        while(i > 0){
            if(intAt(x, length - i) != intAt(x, i - 1)){
                return false;
            }
            i--;
        }
        return true;
    }
    
    int intAt(int x, int p){
        int test = x;
        int result = 0;
        result = (int) (test / Math.pow(10, p)) % 10;
        return result;
    }
}