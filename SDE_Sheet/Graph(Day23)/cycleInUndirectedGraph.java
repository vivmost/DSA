class Solution
{
    static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(isCyclic(adj,V,i,-1,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V,int s,int parent,boolean[] visited){
        ArrayList<Integer> arr=list.get(s);
        visited[s]=true;
        for(int i=0;i<arr.size();i++){
           if(!visited[arr.get(i)]){
               if(isCyclic(list,V,arr.get(i),s,visited)){
                    return true;
               }
           }else if(arr.get(i)!=parent){
               return true;
           }
        }
        return false;
    }
       
}