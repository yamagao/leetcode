public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        
        if (root==null){
            return result;
        }
        
        ArrayList<Integer> current=new ArrayList<Integer>();
        buildResult(root, sum, current, result);
        
        return result;
    }
    private void buildResult(TreeNode root,int sum, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result){
        
        if (root==null){
            return;
        }
        
        int currentVal=root.val;
        current.add(currentVal);
        if (root.left==null && root.right==null){
            
            if (sum-currentVal==0){
                ArrayList<Integer> temp=new ArrayList<Integer> (current);
                result.add(temp);
            }
        }
        
        buildResult(root.left, sum-currentVal, current, result);
        buildResult(root.right, sum-currentVal, current, result);
        
        current.remove(current.size()-1);
    }
}