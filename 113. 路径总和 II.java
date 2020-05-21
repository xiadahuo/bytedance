/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        helper(res, sum , root, new ArrayList<>());
        return res;
    }
    public void helper(List<List<Integer>> res, int sum, TreeNode root, List<Integer> temp){
        if(root == null) return;
        if(root.val == sum && root.left == null && root.right == null){
            temp.add(root.val);
            res.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        temp.add(root.val);
        helper(res, sum - root.val, root.left, temp);
        helper(res, sum - root.val, root.right, temp);
        temp.remove(temp.size()-1);
    }
}