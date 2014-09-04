public class Solution {
    public String convert(String s, int nRows) {
        int length = s.length();
        if(nRows == 1 || length < nRows + 1){
            return s;
        }
        String result = "";
        int round = 2 * nRows - 2;
        int firstRow = (length - 1) / round + 1;
        int tail = (length -1) % round;
        int lastRow = tail < (nRows - 1) ? firstRow - 1: firstRow;
        int current;
        for(int i = 0; i < nRows; i++){
            current = 0;
            if(i == 0){
                for(int j = 0; j < firstRow; j++){
                    result = result.concat(s.substring(current, current + 1));
                    current += round;
                }
                continue;
            }
            if(i == nRows - 1){
                for(int j = 0; j < lastRow; j++){
                    result = result.concat(s.substring(current + i, current + i + 1));
                    current += round;
                }
                continue;
            }
            if(i < length){
                result = result.concat(s.substring(i, i + 1));
                current += round;
            }
            for(int j = 1; j < lastRow + 1; j++){
                if(current - i < length){
                    result = result.concat(s.substring(current - i, current - i + 1));
                }
                if(current + i < length){
                    result = result.concat(s.substring(current + i, current + i + 1));
                }
                current += round;
            }
        }
        return result;
    }
}