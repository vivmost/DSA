class Solution{
    Node root;
    Node head;
    Node prev = null;
    
    Node bToDLL(Node root) {
        bToDLLHelper(root);
        return head;
    }
    
	void bToDLLHelper(Node root){
        if (root == null) return;
        
        bToDLLHelper(root.left);
        
        if (prev == null) 
            head = root;
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        
        bToDLLHelper(root.right);
    }
}