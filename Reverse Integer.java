public class Solution {
    public int reverse(int x) {
        int count = 0;
        int result = 0;
        int expo;
        int test = x;
        while(test / 10 != 0){
            test /= 10;
            count++;
        }
        for(int i = 0; i <= count; i++){
            expo = count - i;
            result += (Math.pow(10, expo)) * (x % 10);
            x /= 10;
        }
        return result;
    }
}