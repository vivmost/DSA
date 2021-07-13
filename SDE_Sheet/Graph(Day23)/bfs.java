class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int N, ArrayList<ArrayList<Integer>> g)
    {
        // Code here
        boolean vis[]=new boolean[N];
        ArrayList<Integer> al=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int u=q.poll();
            al.add(u);
            for(int v:g.get(u)){
                if(!vis[v]){
                    q.add(v);
                    vis[v]=true;
                }
            }
        }
        return al;
    }
}