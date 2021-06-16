class Solution{
    public static boolean isPowerofTwo(long n){
     
        long check = (n & (n-1));
        if( n != 0 && check == 0) {
            return true;
        }else {
            return false;
        }

    }    
}