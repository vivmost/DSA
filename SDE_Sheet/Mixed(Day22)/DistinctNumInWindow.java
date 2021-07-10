class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        ArrayList<Integer> a=new ArrayList<Integer>();
        
        for(int i=0;i<k;i++)
        {
           map.put(A[i],map.getOrDefault(A[i],0)+1);
            
        }
        a.add(map.size());
        for(int i=k;i<n;i++)
        {
            if(map.get(A[i-k])==1)
            map.remove(A[i-k]);
            else
            map.put(A[i-k],map.get(A[i-k])-1);
            
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            a.add(map.size());
        }
        
        return a;
    }
}