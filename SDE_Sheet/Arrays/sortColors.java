class Solution {
    public void sortColors(int[] nums) {
        
        int l = 0,  m = 0, h = nums.length-1;
        
        for(int i = 0; i < nums.length; i++){
            if(m <= h){
                if(nums[i] == 0){
                int temp = nums[l];
                nums[l] = nums[i];
                nums[i] = temp;
                l++; m++;
            }else if(nums[i] == 1){
                m++;
            }else{
                int temp = nums[h];
                nums[h] = nums[i];
                nums[i] = temp;
                h--;
                i--;
                }
            }
        }
        
        System.out.print("[");
         for(int i : nums){
             if(i < nums.length -1){
                System.out.print(i + ",");
             }else{
                System.out.print(i);       
             }
         }
        System.out.print("]");
        

    }
}