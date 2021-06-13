class Solution {
    public int trap(int[] height) {
        
        int l = 0, r = height.length-1, rmax = 0, lmax = 0, res = 0;
        
        while(l <= r) {
            if(height[l] <= height[r]) {
               if(height[l] > lmax) lmax = height[l];
               else res+= lmax - height[l];
               l++;
            } else {
                if(height[r] > rmax) rmax = height[r];
                else res += rmax - height[r];
                r--;
            }
        }
        
        return res;
        
    }
}