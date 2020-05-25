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
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root, int curSum){
        if(root == null) return 0;
        curSum = curSum * 10 + root.val;
        if(root.left == null && root.right == null) 
            return curSum;
        int leftSum = dfs(root.left, curSum);
        int rightSum = dfs(root.right, curSum);
        return leftSum + rightSum; 
    }
}