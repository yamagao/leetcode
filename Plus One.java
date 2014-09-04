public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int len = digits.length;
        for(int i = len - 1; i > -1; i--){
            if(digits[i] + carry == 10){
                digits[i] = 0;
            }
            else{
                digits[i] += carry;
                return digits;
            }
        }
        int[] result = new int[len + 1];
        for(int i = len - 1; i > -1; i--){
            result[i + 1] = result[i];
        }
        result[0] = 1;
        return result;
    }
}