class Solution {
    static void dfs(ArrayList<ArrayList<Integer>> adj,int i, Stack<Integer> st, boolean[] visited){
        visited[i]=true;
        for(int j : adj.get(i)){
            if(visited[j]==false){
                dfs(adj,j,st,visited);
            }
        }
        st.push(i);
    }
    
    static int[] topoSort( int N ,ArrayList<ArrayList<Integer>> adj) {
        // add your code here
        Stack<Integer> st = new Stack<Integer>();
        boolean visited[] = new boolean[N];
        for(int i=0;i<N;i++){
            if(visited[i]==false){
                dfs(adj,i,st,visited);
            }
        }
        int a[]=new int[N];
        int y=0;
        while(!st.isEmpty())
        {
            a[y] = st.peek();
            st.pop();
            y++;
        }
        return a;
    }
}
