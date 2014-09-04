public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        if(numRows < 1){
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        row.add(1);
        list.add(row);
        for(int i = 1; i < numRows; i++){
            row = new ArrayList<Integer>();
            row.add(1);
            for(int j = 1; j < i; j++){
                row.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }
}