class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
         int x = 0, y = 0 , z = n-1;
        
        while(x <= z && y < m){
            if(arr1[x] < arr2[y]){
                x++;
            }else{
                long temp = arr1[z];
                arr1[z] = arr2[y];
                arr2[y] = temp;
                
                y++;
                z--;
            }
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
    }
}
