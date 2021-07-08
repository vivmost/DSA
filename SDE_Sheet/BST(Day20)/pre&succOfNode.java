/* BST Node
class Node
{
	int key;
	Node left, right;
	
	Node(int item)
	{
	    data = item;
	    left = right = null;
	}
}
*/

// This function finds predecessor and successor of key in BST.
// It sets pre and suc as predecessor and successor respectively
class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       if(root == null) {
           return;
       }
       if(root.data == key) {
           if(root.left!=null) {
               Node temp = root.left;
               while(temp.right!=null) {
                   temp = temp.right;
               }
               p.pre = temp;
           }
           if(root.right!=null) {
               Node temp = root.right;
               while(temp.left!=null) {
                   temp = temp.right; 
               }
               s.succ = temp;
           }
       }
       else if(root.data > key) {
           s.succ = root;
           findPreSuc(root.left, p, s, key);
       }
       else {
           p.pre = root;
           findPreSuc(root.right, p, s, key);
       }
    }
}