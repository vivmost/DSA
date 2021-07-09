/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution{
    int result=0, visited=1;
    public int kthLargest(Node root,int k){
        findLargest(root,k);
        return result;
    }
    
    void findLargest(Node root, int k){
       if(root==null){
            return;
        }
        findLargest(root.right,k);
        if(visited==k){
            result=root.data;
            visited++;
            return;
        } else {
            visited++;
        }
        findLargest(root.left,k); 
    }
}