class Solution {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        final int N = nums.length;
        int sum = 0;
        
        for (int num : nums) {
            sum += num;
        }
        
        if ((sum & 1) == 1) return false;
        sum = sum >> 1;
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;
        
        for (int i = 1; i <= N; i++) {
            boolean[] temp = new boolean[sum + 1];
            for (int j = 0; j <= sum; j++) {
                if (j >= nums[i-1]) {
                    temp[j] = dp[j] || dp[j-nums[i-1]];
                } else {
                    temp[j] = dp[j];
                }
            }
            dp = temp;
        }
        return dp[sum];
    }
}