
// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution{
    // Return the size of the largest sub-tree which is also a BST
   public static int size(Node root){
        if(root == null)
            return 0;
        return 1+size(root.left)+size(root.right);
    }
    
    static boolean isBST(Node root,int minval,int maxval){
        if(root == null)
            return true;
        return root.data>minval && root.data<maxval && isBST(root.left,minval,root.data) && isBST(root.right,root.data,maxval);
    }
    
    static int largestBst(Node root){
        // Write your code here
        if(root == null)
            return 0;
        if(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)) 
            return size(root);
        else{
            return Math.max(largestBst(root.left),largestBst(root.right));
        }
    }
    
}