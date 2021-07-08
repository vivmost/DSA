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
    int res = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        postTraverse(root);
        return res;
    }
    
    public int postTraverse(TreeNode root){
        if(root == null) return 0;
        
        int leftMax = postTraverse(root.left);
        int rightMax = postTraverse(root.right);
        
        // Max of (root+left), (root+right), (root); 
        //only max1 gets returned to it's parent to make a single path along the parent node.
        int max1 = Math.max(Math.max(leftMax, rightMax)+root.val, root.val); 
        
        // Max of (root+left), (root+right), (root), (root+left+right); 
        // check if a subtree makes the max sum path.
        int max2 = Math.max(max1, leftMax + rightMax + root.val);
        
        res = Math.max(res, max2); 
        
        return max1;
    }
}