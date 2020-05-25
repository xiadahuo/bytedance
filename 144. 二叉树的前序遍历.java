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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> st = new Stack<>();
        TreeNode p = root;
        while(p != null || !st.isEmpty()){
            while(p != null){
                st.push(p);
                res.add(p.val);
                p = p.left;
            }
            p = st.pop();
            p = p.right;
        }
        return res;
    }
}