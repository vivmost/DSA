class Solution {
    public int superEggDrop(int eggs , int floors){
        int[][] strg = new int[floors+1][eggs+1];
        for(int i=1;i<=floors;i++){
            for(int j=1;j<=eggs;j++){
                if(i==1&&j==1){
                    strg[i][j]=1;
                }
               else if(i==1){
                    strg[i][j]=1;
                }
                else if(j==1){
                    strg[i][j]=i;
                }
                else{
                    if(j<=i){
                    strg[i][j]= strg[i-1][j-1]+strg[i-1][j]+1;
                    }
                    else {
                        strg[i][j]=strg[i][j-1];
                    }
                     
                }
                if(strg[i][j]>=floors){
                    return i;
                }
               
                
            }
        }
        return 0;
    }
}