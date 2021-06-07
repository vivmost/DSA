class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        int e1 = 0, e2 = 0, c1 = 0, c2 = 0;
        
        for(int i: nums) {
            if(e1 == i) {
                c1++;
            } else if(e2 == i) {
                c2++;
            } else if(c1== 0) {
                e1 = i;
                c1++;
            } else if(c2 == 0) {
                e2 = i;
                c2++;
            } else {
                c1--;
                c2--;
            }
        } 

        c1 = 0; c2 = 0;
        for(int i : nums) {
            if(e1 == i) {
                c1++;
            }else if(e2 == i) {
                c2++;
            }
        }
        
        if(c1 > (nums.length/3)) {
        ans.add(e1);    
        } 
        
        if(c2 > (nums.length/3)) {
        ans.add(e2);    
        }
        
        return ans;
        
        
    }
}