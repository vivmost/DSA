/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Tree{   
    int max=0;
    ArrayList<Integer> leftView(Node root){
      // Your code here
      ArrayList<Integer> a=new ArrayList<Integer>();
      leftview(a,root,1);
      return a;
    }
    
    void leftview(ArrayList a,Node r,int level){
        if(r==null) return;
        
        if(max<level){
          a.add(r.data);
          max=level;
        }
        
        leftview(a,r.left,level+1);
        leftview(a,r.right,level+1);
    }
}