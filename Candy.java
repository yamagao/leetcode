public class Solution {
    public int candy(int[] ratings) {
        if(ratings == null || ratings.length == 0){
            return 0;
        }
        int[] candy = new int[ratings.length];
        candy[0] = 1;
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i - 1]){
                candy[i] = candy[i - 1] + 1;
            }
            else{
                candy[i] = 1;
            }
        }
        int before = 1;
        for(int i = ratings.length - 2; i > -1; i--){
            if(ratings[i] > ratings[i + 1]){
                before = before + 1;
                candy[i] = Math.max(candy[i], before);
            }
            else{
                before = 1;
                candy[i] = Math.max(candy[i], before);
            }
        }
        int sum = 0;
        for(int i = 0; i < candy.length; i++){
            sum += candy[i];
        }
        return sum;
    }
}