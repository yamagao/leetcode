public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(rowIndex < 0){
            return result;
        }
        result.add(1);
        int temp = 0;
        for(int i = 1; i <= rowIndex; i++){
            result.add(1);
            for(int j = 1; j < i; j++){
                result.add(result.remove(0) + result.get(0));
            }
            result.remove(0);
            result.add(1);
        }
        return result;
    }
}