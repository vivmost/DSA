class Solution 
{
    //Function to detect cycle in a directed graph.
   static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
      int indegree[]=new int[V];
        for(int i=0;i<V;i++)
        for(int u:adj.get(i))
        indegree[u]++;
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)
        if(indegree[i]==0)
        q.add(i);
        while(!q.isEmpty()){
            int v=q.poll();
            count++;
            for(int u:adj.get(v)){
                indegree[u]--;
                if(indegree[u]==0)
                q.add(u);
            }
        }
        return count!=V;
    }
}