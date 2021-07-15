class Solution
{
    public int kosaraju(int n ,ArrayList<ArrayList<Integer>> adj)
    {
        boolean visited[]=new boolean[n];
        List<Integer> order=fillOrder(adj,visited,n);
        ArrayList<ArrayList<Integer>> reverse=getTranspose(adj,n);
        visited=new boolean[n];
        Collections.reverse(order);
        List<List<Integer>> SCC=new ArrayList<>();
        for(int i=0;i<order.size();i++){
            int v=order.get(i);
            if(!visited[v]){
                List<Integer> temp=new ArrayList<>();
                DFS(reverse,v,visited,temp);
                SCC.add(temp);
            }
        }
        return SCC.size();
    }
    
    static ArrayList<ArrayList<Integer>> getTranspose(ArrayList<ArrayList<Integer>> adj, int n){
        ArrayList<ArrayList<Integer>> g=new ArrayList<>();
        for(int i=0;i<n;i++)
        g.add(i,new ArrayList<Integer>());
        for(int v=0;v<n;v++)
        for(int i=0;i<adj.get(v).size();i++)
        g.get(adj.get(v).get(i)).add(v);
        return g;
    }
    
    static List<Integer> fillOrder(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int n){
        List<Integer> order=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        if(!visited[i])
        DFS(adj,i,visited,order);
        return order;
    }
    
    static void DFS(ArrayList<ArrayList<Integer>> adj,int v,boolean[] visited,List<Integer> order){
        visited[v]=true;
        for(int i=0;i<adj.get(v).size();i++)
        if(!visited[adj.get(v).get(i)])
        DFS(adj,adj.get(v).get(i),visited,order);
        order.add(v);
    }
}