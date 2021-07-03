/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    List<Integer> ls=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        helper_postoder(root);
        return ls;
    }
    
    public void helper_postoder(TreeNode root){
        if(root==null)
            return;
        helper_postoder(root.left);
        helper_postoder(root.right);
        ls.add(root.val);
    }
}