class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
   public int isPairPresent(Node root, int target)
    {
        HashSet<Integer> s = new HashSet<>();
        return isPair(root, target, s);
        
    }
    
    public int isPair(Node root, int target, HashSet<Integer> s)
    {
        if(root == null) return 0;
        
        if( isPair(root.left, target, s) == 1 )
            return 1;
            
        if( s.contains(target - root.data)) return 1;
        else s.add(root.data);
        
        return isPair(root.right, target, s);
        
    }
}
