public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1, index2, match, count;
        index1 = 0;
        index2 = 0;
        match = 0;
        count = 0;
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++ ){
            if(!map.containsKey(numbers[i])){
                map.put(target - numbers[i], i + 1);
            }
            else{
                result[0] = map.get(numbers[i]) < i + 1 ? map.get(numbers[i]) : i + 1;
                result[1] = map.get(numbers[i]) > i + 1 ? map.get(numbers[i]) : i + 1;
            }
        }
        return result;
    }
}