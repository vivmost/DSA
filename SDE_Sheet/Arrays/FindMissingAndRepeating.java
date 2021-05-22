class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
    
       int xor = 0;
       int ans[] = new int[2];
   for(int i = 0 ; i < arr.length; i++){
       xor ^= arr[i];
       xor ^= (i + 1);
   }
   int rsbmask = xor & (-xor);
   int x = 0;
   int y  = 0;
   for(int i = 0 ; i < arr.length; i++){
       if((rsbmask & arr[i]) == 0){
           x ^= arr[i];
       }else{
           y ^= arr[i];
       }
   }
   
   for(int i = 1 ; i <= arr.length; i++){
       if((rsbmask & i) == 0){
           x ^= i;
       }else{
           y ^= i;
       }
   }
   
   for(int i = 0 ; i < arr.length; i++){
       if(arr[i] == x){
           ans[0] = x;
           ans[1] = y;
           break;
       }
       
       if(arr[i] == y){
           ans[0] = y;
           ans[1] = x;
           break;
       }
   }
        
        return ans;
    }
}