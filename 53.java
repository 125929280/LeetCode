class Solution {
    public int maxSubArray(int[] nums) {
        int l = nums.length, ans = nums[0];
        int[] dp = new int[l];
        dp[0] = nums[0];
        for(int i = 1;i < l;i ++) {
            dp[i] = nums[i] + Math.max(dp[i], dp[i-1]);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}