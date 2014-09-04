public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int[] a = new int[prices.length];
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(prices[i] - min > diff){
                diff = prices[i] - min;
            }
            a[i] = diff;
        }
        int[] b = new int[prices.length];
        int max = Integer.MIN_VALUE;
        diff = 0;
        for(int i = prices.length - 1; i > -1; i--){
            if(prices[i] > max){
                max = prices[i];
            }
            if(max - prices[i] > diff){
                diff = max - prices[i];
            }
            b[i] = diff;
        }
        max = 0;
        for(int i = 0; i < prices.length; i++){
            if(a[i] + b[i] > max){
                max = a[i] + b[i];
            }
        }
        return max;
    }
}