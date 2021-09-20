class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len = nums.length, ans = 1;
        int[] dp = new int[len];
        dp[0] = 1;
        for(int i = 1;i < len;i ++) {
            dp[i] = 1;
            if(nums[i] > nums[i-1]) dp[i] = dp[i-1] +1;
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}