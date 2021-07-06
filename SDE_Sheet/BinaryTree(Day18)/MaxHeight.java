/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node){
        if (node == null)
                return 0;
            else{
                int lDepth = height(node.left);
                int rDepth = height(node.right
                
                if (lDepth > rDepth)
                    return (lDepth + 1);
                 else
                    return (rDepth + 1);
            }    
    }
}
