public class Solution {
    public int reverse(int x) {
        if(x == 0){
            return 0;
        }
        int result = x % 10;
        x /= 10;
        while(x != 0){
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
