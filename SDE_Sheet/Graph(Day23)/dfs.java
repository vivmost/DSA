class Solution
{
    public void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> list){
        visited[v] = true;
        list.add(v);
        for(int i : adj.get(v)){
            if(!visited[i]){
                dfs(i, adj, visited, list);
            }
        }
    }
    
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<V; i++){
            if(!visited[i]){
                dfs(i, adj, visited, list);
            }
        }
        return list;
    }
}