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
    TreeNode prev;
     public void flatten(TreeNode root) {
         bTreeToLL(root);
     }
 
     private void bTreeToLL(TreeNode root) {
         if (root == null)
             return;
         bTreeToLL(root.right);
         bTreeToLL(root.left);
         root.right = prev;
         root.left = null;
         prev = root;
     }
 }