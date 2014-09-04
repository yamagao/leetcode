public class Solution {
    public String intToRoman(int num) {
        String result = "";
        char[] roman = new char[]{'I','V','X','L','C','D','M'};
        int divider = 1000;
        int digit;
        for(int i = 6; i >= 0; i -= 2){
            digit = num / divider;
            if(digit <= 3){
                while(digit > 0){
                    result = result + roman[i] + "";
                    digit--;
                }
            }
            else if(digit == 4){
                result = result + roman[i] + roman[i + 1] + "";
            }
            else if(digit <= 8){
                result = result + roman[i + 1] + "";
                while(digit > 5){
                    result = result + roman[i] + "";
                    digit--;
                }
            }
            else if(digit == 9){
                result = result + roman[i] + roman[i + 2] + "";
            }
            num %= divider;
            divider /= 10;
        }
        return result;
    }
}