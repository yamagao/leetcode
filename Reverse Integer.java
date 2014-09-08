public class Solution {
    public int reverse(int x) {
        if(x == 0){
            return 0;
        }
        int temp = x;
        int result = temp % 10;
        temp /= 10;
        while(temp != 0){
            result = result * 10 + temp % 10;
            temp /= 10;
        }
        int overflow = x^result;
        if(overflow < 0){
            return -1;
        }
        return result;
    }
}
