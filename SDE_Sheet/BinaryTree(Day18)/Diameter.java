
/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        if(root==null) return 0;
        if(root.right==null && root.left==null) return 1;
        
        int left=height(root.left);
        int right=height(root.right);
        
        int ld=diameter(root.left);
        int rd=diameter(root.right);
       
        return Math.max(Math.max(ld,rd),left+right+1);
    }
    
    static int height(Node root){
        if(root==null)
        return 0;
        int left=height(root.left);
        int right=height(root.right);
        return (1+Math.max(left,right));
    }
}