class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        
        if(nums == null || n == 0) {
            return result;
        }
        
        Arrays.sort(nums);
        
        for(i = 0 ; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int target_2 = target - nums[i] - nums[j];
                int front = j + 1, back = n - 1;
                
                while(front < back) {
                    if((nums[front] + nums[back]) < target_2) {
                        front++;
                    } else if((nums[front] + nums[back]) > target_2){
                        back--;
                    } else {
                       List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);

                        result.add(quad);
                        
                        while(front < back && nums[front] == quad.get(2)) {
                            ++front;
                        }
                            
                        while (front < back && nums[back] == quad.get(3)) {
                            --back;
                        } 
                    }
                    
                    
                }
                while( j + 1 < n && nums[j+1] == nums[j]) {
                    ++j;
                }
               
            }
             while( (i + 1) < n && nums[i+1] == nums[i] ) {
                ++i;
            }
           
        }
        
            return result;
    }
}