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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean order = true;
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null)
            return res;
        
        Stack<TreeNode> first = new Stack<>();
        Stack<TreeNode> second = new Stack<>();
        
        first.push(root);
        
        while(!first.isEmpty() || !second.isEmpty()) {
            List<Integer> tmpList = new ArrayList<>();
            if(order) {
                while(!first.isEmpty()) {
                    TreeNode tmp = first.pop();
                    tmpList.add(tmp.val);
                    if(tmp.left != null)
                        second.push(tmp.left);
                    if(tmp.right != null)
                        second.push(tmp.right);
                }
                order = false;
            } else {
                while(!second.isEmpty()) {
                    TreeNode tmp = second.pop();
                    tmpList.add(tmp.val);
                    if(tmp.right != null)
                        first.push(tmp.right);
                    if(tmp.left != null)
                        first.push(tmp.left);
                }
                order = true;
            }
            res.add(new ArrayList<Integer>(tmpList));
        } 
        return res;
    }
}