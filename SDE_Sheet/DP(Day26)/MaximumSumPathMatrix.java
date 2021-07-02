class Solution{
    static int maximumPath(int n, int mat[][])
    {
        // code here
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j > 0 && j < n-1) {
                    mat[i][j] += Math.max(mat[i-1][j], Math.max(mat[i-1][j-1], mat[i-1][j+1]));
                } else if(j > 0) {
                    mat[i][j] += Math.max(mat[i-1][j], mat[i-1][j-1]);
                }else if(j < n-1) {
                    mat[i][j] += Math.max(mat[i-1][j], mat[i-1][j+1]);
                }
            }
        }
        
         int ans = 0;
            for(int j = 0; j < n; j++)
                ans = Math.max(mat[n-1][j], ans);
                
         return ans;
    }
}