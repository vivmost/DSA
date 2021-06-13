Class GfG {
    public static vector<Integer> findMin( int[] deno,int V) {

        Vector<Integer> ans = new Vector<>();
        int n = deno.length;

        for(int i = n; i >= 0; i--) {
            while(V >= deno[i]) {
                V -= deno[i];
                ans.add(deno[i]);
            }
        }

        return ans;
    }
}